package configuracion.personajes;

import javax.swing.*;
import java.util.Date;

public class Heroe extends Personaje{
    String nombreCompleto;
    Date fechaNacimiento;
    String paisResidencia;
    String foto;

    public Heroe(String tipo, String pseudonimo, String raza, String franquicia, String fotoTraje, Double fuerza, Double velocidad, Double inteligencia, Double economia, Double poderTotal, String nombreCompleto, Date fechaNacimiento, String paisResidencia, String foto) {
        super(tipo, pseudonimo, raza, franquicia, fotoTraje, fuerza, velocidad, inteligencia, economia, poderTotal);
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.paisResidencia = paisResidencia;
        this.foto = foto;
    }

    public String getNombreCompleto() {return nombreCompleto;}

    public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}


    public Date getFechaNacimiento() {return fechaNacimiento;}

    public void setFechaNacimiento(Date fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}


    public String getPaisResidencia() {return paisResidencia;}

    public void setPaisResidencia(String paisResidencia) {this.paisResidencia = paisResidencia;}


    public String getFoto() {return foto;}

    public void setFoto(String foto) {this.foto = foto;}
}
