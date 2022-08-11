import java.util.ArrayList;

public class Seleccion {

    private int id;
    private String nombreSeleccion;
    private String urlFotoBandera;
    private Federacion federacion;
    private ArrayList<Jugador> plantel;

    public Seleccion(int id, String nombreSeleccion, String urlFotoBandera, Federacion federacion) {
        this.id = id;
        this.nombreSeleccion = nombreSeleccion;
        this.urlFotoBandera = urlFotoBandera;
        this.federacion = federacion;
        this.plantel = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSeleccion() {
        return nombreSeleccion;
    }

    public void setNombreSeleccion(String nombreSeleccion) {
        this.nombreSeleccion = nombreSeleccion;
    }

    public String getUrlFotoBandera() {
        return urlFotoBandera;
    }

    public void setUrlFotoBandera(String urlFotoBandera) {
        this.urlFotoBandera = urlFotoBandera;
    }

    public Federacion getFederacion() {
        return federacion;
    }

    public void setFederacion(Federacion federacion) {
        this.federacion = federacion;
    }

    public ArrayList<Jugador> getPlantel() {
        return plantel;
    }

    public void setPlantel(ArrayList<Jugador> plantel) {
        this.plantel = plantel;
    }
}
