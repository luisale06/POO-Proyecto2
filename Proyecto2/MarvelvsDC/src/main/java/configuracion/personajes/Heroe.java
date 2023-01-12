package configuracion.personajes;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Heroe extends Personaje{
    String nombreCompleto;
    String fechaNacimiento;
    String paisResidencia;
    ImageIcon foto;

    public Heroe(String tipo, String pseudonimo, String raza, String franquicia, ImageIcon fotoTraje, Integer fuerza, Integer velocidad, Integer inteligencia, Integer economia, String nombreCompleto, String fechaNacimiento, String paisResidencia, ImageIcon foto) {
        super(tipo, pseudonimo, raza, franquicia, fotoTraje, fuerza, velocidad, inteligencia, economia);
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.paisResidencia = paisResidencia;
        this.foto = foto;
    }

    public String getNombreCompleto() {return nombreCompleto;}

    public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}


    public String getFechaNacimiento() {return fechaNacimiento;}

    public void setFechaNacimiento(String fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}


    public String getPaisResidencia() {return paisResidencia;}

    public void setPaisResidencia(String paisResidencia) {this.paisResidencia = paisResidencia;}


    public ImageIcon getFoto() {return foto;}

    public void setFoto(ImageIcon foto) {this.foto = foto;}
}
