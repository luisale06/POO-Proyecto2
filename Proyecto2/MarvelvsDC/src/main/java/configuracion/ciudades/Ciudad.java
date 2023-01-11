package configuracion.ciudades;

public class Ciudad {
    String pais;
    String provincia;
    String ciudad;
    String escenario;

    public Ciudad(String pais, String provincia, String ciudad, String escenario) {
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.escenario = escenario;
    }

    public String getPais() {return pais;}

    public String getProvincia() {return provincia;}

    public String getCiudad() {return ciudad;}

    public String getEscenario() {return escenario;}

    public void setPais(String pais) {this.pais = pais;}

    public void setProvincia(String provincia) {this.provincia = provincia;}

    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public void setEscenario(String escenario) {this.escenario = escenario;}

    @Override
    public String toString() {
        return pais+" / "+provincia+" / "+ciudad+" / "+escenario;
    }
}
