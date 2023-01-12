package configuracion.personajes;

import javax.swing.*;

public class Personaje {
    String tipo;
    String pseudonimo;
    String raza;
    String franquicia;
    ImageIcon fotoTraje;
    Integer fuerza;
    Integer velocidad;
    Integer inteligencia;
    Integer economia;

    public Personaje(String tipo, String pseudonimo, String raza, String franquicia, ImageIcon fotoTraje,Integer fuerza, Integer velocidad, Integer inteligencia, Integer economia) {
        this.tipo = tipo;
        this.pseudonimo = pseudonimo;
        this.raza = raza;
        this.fotoTraje = fotoTraje;
        this.franquicia = franquicia;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
        this.economia = economia;
    }

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}


    public String getPseudonimo() {return pseudonimo;}

    public void setPseudonimo(String pseudonimo) {this.pseudonimo = pseudonimo;}


    public String getRaza() {return raza;}

    public void setRaza(String raza) {this.raza = raza;}


    public ImageIcon getFotoTraje() {return fotoTraje;}

    public void setFotoTraje(ImageIcon fotoTraje) {this.fotoTraje = fotoTraje;}


    public String getFranquicia() {return franquicia;}

    public void setFranquicia(String franquicia) {this.franquicia = franquicia;}


    public Integer getFuerza() {return fuerza;}

    public void setFuerza(Integer fuerza) {this.fuerza = fuerza;}


    public Integer getVelocidad() {return velocidad;}

    public void setVelocidad(Integer velocidad) {this.velocidad = velocidad;}


    public Integer getInteligencia() {return inteligencia;}

    public void setInteligencia(Integer inteligencia) {this.inteligencia = inteligencia;}


    public Integer getEconomia() {return economia;}

    public void setEconomia(Integer economia) {this.economia = economia;}
}
