package configuracion.personajes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BDvillano {
    String filepath = "villanos.json";
    ArrayList<Personaje> villanos = new ArrayList<>();

    public BDvillano() {
        File file = new File(filepath);

        if (!file.exists()) {
            try {guardar();} catch (IOException e) {throw new RuntimeException(e);}}
    }

    public void addVillano(Villano villanoNuevo) {
        villanos.add(villanoNuevo);
    }

    public void guardar() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this.villanos);

        FileWriter writer = new FileWriter(filepath);
        writer.write(json);
        writer.close();
    }

    public void restaurar() throws IOException{
        Gson gson = new Gson();
        this.villanos = gson.fromJson(new FileReader(filepath), new TypeToken<List<Personaje>>(){}.getType());
    }

    public ArrayList<Personaje> getVillanos() {
        return villanos;
    }
}
