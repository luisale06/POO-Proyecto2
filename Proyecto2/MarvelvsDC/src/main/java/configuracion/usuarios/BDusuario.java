package configuracion.usuarios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BDusuario {
    String filepath = "usuarios.json";

    ArrayList<usuario> usuarios = new ArrayList<>();

    public BDusuario() {
        File file = new File(filepath);
        if (!file.exists()) {
            try {
                guardar();
            } catch (IOException e) {throw new RuntimeException(e);}}
    }

    public void addUsuario(usuario usuarioNuevo){ usuarios.add(usuarioNuevo); }

    public void guardar() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this.usuarios);

        FileWriter writer = new FileWriter(filepath);
        writer.write(json);
        writer.close();
    }

    public void restaurar() throws IOException{
        Gson gson = new Gson();
        this.usuarios = gson.fromJson(new FileReader(filepath), new TypeToken<List<usuario>>(){}.getType());
    }

    public boolean existeUsuario(usuario usuarioNuevo) {
        boolean flag = false;
        for(usuario usuario : usuarios) {
            if(usuarioNuevo.getNombre().equals(usuario.getNombre()) && usuarioNuevo.getApellidos().equals(usuario.getApellidos()) && usuarioNuevo.getUsername().equals(usuario.getUsername()) && usuarioNuevo.getCorreo().equals(usuario.getCorreo()) && usuarioNuevo.getContraseña().equals(usuario.getContraseña())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public ArrayList<usuario> getUsuarios() {
        return usuarios;
    }
}
