package configuracion.usuarios;

import java.util.Objects;

public class usuario {
    private String nombre;
    private String apellidos;
    private String username;
    private String correo;
    private String contraseña;

    public usuario(String nombre, String apellidos, String username, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.username = username;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usuario usuario = (usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellidos, usuario.apellidos) && Objects.equals(username, usuario.username) && Objects.equals(correo, usuario.correo) && Objects.equals(contraseña, usuario.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, username, correo, contraseña);
    }

    @Override
    public String toString() {
        return nombre+" / "+apellidos+" / "+username+" / "+correo+" / "+contraseña;
    }
}
