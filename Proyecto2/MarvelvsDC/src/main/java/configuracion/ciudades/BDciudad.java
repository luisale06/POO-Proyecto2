package configuracion.ciudades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class BDciudad {
    String filepath = "ciudades.json";
    ArrayList<Ciudad> ciudades = new ArrayList<>();

    public BDciudad() {
        // Crea una instancia de File con la ruta del archivo
        File file = new File(filepath);

        // Comprueba si el archivo existe
        if (!file.exists()) {
            // Crea el archivo
            try {
                guardar();
            } catch (IOException e) {throw new RuntimeException(e);}
        }
    }

    public void addCiudad(Ciudad ciudadNueva) {
        ciudades.add(ciudadNueva);
        System.out.println(ciudades);
    }

    public void guardar() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this.ciudades);

        FileWriter writer = new FileWriter(filepath);
        writer.write(json);
        writer.close();
    }

    public void restaurar() throws IOException{
        Gson gson = new Gson();
        this.ciudades = gson.fromJson(new FileReader(filepath), new TypeToken<List<Ciudad>>(){}.getType());
    }

    public boolean existeCiudad(Ciudad ciudadNueva) {
        boolean flag = false;
        for(Ciudad ciudad : ciudades) {
            if(ciudadNueva.getPais().equals(ciudad.getPais()) && ciudadNueva.getProvincia().equals(ciudad.getProvincia()) && ciudadNueva.getCiudad().equals(ciudad.getCiudad()) && ciudadNueva.getEscenario().equals(ciudad.getEscenario())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

}
