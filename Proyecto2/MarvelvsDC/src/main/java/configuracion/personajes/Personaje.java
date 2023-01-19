package configuracion.personajes;

import javax.swing.*;

public class Personaje {
    String tipo;
    String pseudonimo;
    String raza;
    String franquicia;
    String fotoTraje;
    Double fuerza;
    Double velocidad;
    Double inteligencia;
    Double economia;
    Double poderTotal;

    public Personaje(String tipo, String pseudonimo, String raza, String franquicia, String fotoTraje, Double fuerza, Double velocidad, Double inteligencia, Double economia, Double poderTotal) {
        this.tipo = tipo;
        this.pseudonimo = pseudonimo;
        this.raza = raza;
        this.fotoTraje = fotoTraje;
        this.franquicia = franquicia;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
        this.economia = economia;
        this.poderTotal = poderTotal;
    }

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}


    public String getPseudonimo() {return pseudonimo;}

    public void setPseudonimo(String pseudonimo) {this.pseudonimo = pseudonimo;}


    public String getRaza() {return raza;}

    public void setRaza(String raza) {this.raza = raza;}


    public String getFotoTraje() {return fotoTraje;}

    public void setFotoTraje(String fotoTraje) {this.fotoTraje = fotoTraje;}


    public String getFranquicia() {return franquicia;}

    public void setFranquicia(String franquicia) {this.franquicia = franquicia;}


    public Double getFuerza() {return fuerza;}

    public void setFuerza(Double fuerza) {this.fuerza = fuerza;}


    public Double getVelocidad() {return velocidad;}

    public void setVelocidad(Double velocidad) {this.velocidad = velocidad;}


    public Double getInteligencia() {return inteligencia;}

    public void setInteligencia(Double inteligencia) {this.inteligencia = inteligencia;}


    public Double getEconomia() {return economia;}

    public void setEconomia(Double economia) {this.economia = economia;}


    public Double getPoderTotal() {return poderTotal;}

    public void setPoderTotal(Double poderTotal) {this.poderTotal = poderTotal;}

    @Override
    public String toString() {
        return "Personaje{" +
                "tipo='" + tipo + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", raza='" + raza + '\'' +
                ", franquicia='" + franquicia + '\'' +
                ", fotoTraje='" + fotoTraje + '\'' +
                ", fuerza=" + fuerza +
                ", velocidad=" + velocidad +
                ", inteligencia=" + inteligencia +
                ", economia=" + economia +
                ", poderTotal=" + poderTotal +
                '}';
    }
}
