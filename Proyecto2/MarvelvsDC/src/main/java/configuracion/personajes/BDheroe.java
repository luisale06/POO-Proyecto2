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

public class BDheroe {
    String filepath = "heroes.json";
    ArrayList<Personaje> heroes = new ArrayList<>();

    public BDheroe() {
        File file = new File(filepath);

        if (!file.exists()) {
            try {guardar();} catch (IOException e) {throw new RuntimeException(e);}}
    }

    public void addHeroe(Heroe heroeNuevo) {
        heroes.add(heroeNuevo);
    }

    public void guardar() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this.heroes);

        FileWriter writer = new FileWriter(filepath);
        writer.write(json);
        writer.close();
    }

    public void restaurar() throws IOException{
        Gson gson = new Gson();
        this.heroes = gson.fromJson(new FileReader(filepath), new TypeToken<List<Personaje>>(){}.getType());
    }

    public ArrayList<Personaje> getHeroes() {
        return heroes;
    }
}
