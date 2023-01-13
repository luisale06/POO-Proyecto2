package configuracion.personajes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import configuracion.ciudades.Ciudad;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BDantiheroe {
    String filepath = "antiheroes.json";
    ArrayList<Personaje> antiheroes = new ArrayList<>();

    public BDantiheroe() {
        File file = new File(filepath);

        if (!file.exists()) {
            try {guardar();} catch (IOException e) {throw new RuntimeException(e);}}
    }

    public void addAntiheroe(Antiheroe antiheroeNuevo) {
        antiheroes.add(antiheroeNuevo);
    }

    public void guardar() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this.antiheroes);

        FileWriter writer = new FileWriter(filepath);
        writer.write(json);
        writer.close();
    }

    public void restaurar() throws IOException{
        Gson gson = new Gson();
        this.antiheroes = gson.fromJson(new FileReader(filepath), new TypeToken<List<Personaje>>(){}.getType());
    }

    public ArrayList<Personaje> getAntiheroes() {
        return antiheroes;
    }
}
