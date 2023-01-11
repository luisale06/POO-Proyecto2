package configuracion.personajes;

import java.util.Date;

public class Heroe extends Personaje{
    String nombreCompleto;
    String fechaNacimiento;
    String pais;

    public Heroe(String tipo, String pseudonimo, String raza, String franquicia, String nombreCompleto, String fechaNacimiento, String pais) {
        super(tipo, pseudonimo, raza, franquicia);
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
