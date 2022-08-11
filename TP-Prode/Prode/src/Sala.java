import java.util.ArrayList;

public class Sala {
    private int id;
    private String nombreSala;
    private Pronosticador pronosticadorCreador;
    private ArrayList<Pronosticador> pronosticadores;

    public Sala(int id, String nombreSala, Pronosticador pronosticadorCreador) {
        this.id = id;
        this.nombreSala = nombreSala;
        this.pronosticadorCreador = pronosticadorCreador;
        this.pronosticadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public Pronosticador getPronosticadorCreador() {
        return pronosticadorCreador;
    }

    public void setPronosticadorCreador(Pronosticador pronosticadorCreador) {
        this.pronosticadorCreador = pronosticadorCreador;
    }

    public ArrayList<Pronosticador> getPronosticadores() {
        return pronosticadores;
    }

    public void setPronosticadores(ArrayList<Pronosticador> pronosticadores) {
        this.pronosticadores = pronosticadores;
    }

    public void agregarPronosticador(Pronosticador pronosticador){
        this.pronosticadores.add(pronosticador);
    }
}

