package configuracion.ciudades;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BDciudad {
    String filepath = "ciudades.json";
    ArrayList<Ciudad> ciudades = new ArrayList<>();

    public void guardarCiudad(String pais, String provincia, String ciudad, String escenario) {
        ciudades.add(new Ciudad(pais, provincia, ciudad, escenario));
    }

    public void guardar() {
        // Convierte el ArrayList a un objeto JSON
        JSONArray array = new JSONArray();
        for (Ciudad ciudad : ciudades) {
            JSONObject obj = new JSONObject();
            obj.put("pais", ciudad.getPais());
            obj.put("provincia", ciudad.getProvincia());
            obj.put("ciudad", ciudad.getCiudad());
            obj.put("escenario", ciudad.getEscenario());
            array.add(obj);
        }

        // Escribe el objeto JSON en un archivo
        try (FileWriter fw = new FileWriter(filepath)) {
            fw.write(array.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void restaurar() {
        // Lee el contenido del archivo
        String json = "";
        try (FileReader reader = new FileReader("people.json")) {
            int c;
            while ((c = reader.read()) != -1) {
                json += (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convierte la cadena JSON a un JSONArray
        JSONArray jsonArray = new JSONArray();

        // Convierte el JSONArray a un ArrayList de objetos
        ciudades = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String pais = (String) jsonObject.get("name");
            String provincia = (String) jsonObject.get("provincia");
            String ciudad = (String) jsonObject.get("ciudad");
            String escenario = (String) jsonObject.get("escenario");

            ciudades.add(new Ciudad(pais, provincia, ciudad, escenario));
        }
    }

}
