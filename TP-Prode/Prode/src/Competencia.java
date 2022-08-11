import java.util.ArrayList;

public class Competencia {

    private int id;
    private String nombre;
    private ArrayList<Partido> paridos;
    private ArrayList<Seleccion> selecciones;

    public Competencia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.paridos = new ArrayList<>();
        this.selecciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getParidos() {
        return paridos;
    }

    public void setParidos(ArrayList<Partido> paridos) {
        this.paridos = paridos;
    }

    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<Seleccion> selecciones) {
        this.selecciones = selecciones;
    }
}
