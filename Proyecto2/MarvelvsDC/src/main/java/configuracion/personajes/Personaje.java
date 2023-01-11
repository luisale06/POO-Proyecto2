package configuracion.personajes;

public class Personaje {
    String tipo;
    String pseudonimo;
    String raza;
    String franquicia;

    public Personaje(String tipo, String pseudonimo, String raza, String franquicia) {
        this.tipo = tipo;
        this.pseudonimo = pseudonimo;
        this.raza = raza;
        this.franquicia = franquicia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }
}
