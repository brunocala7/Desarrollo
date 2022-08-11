import java.util.ArrayList;

public class Juego {

    private int id;
    private ArrayList<Sala> salasDeJuego;
    private Competencia competenciaDelJuego;
    private ArrayList<ElementoPronosticable> posiblesPronosticos;

    public Juego(int id, Competencia competenciaDelJuego) {

        this.id = id;
        this.salasDeJuego = new ArrayList<>();
        this.competenciaDelJuego = competenciaDelJuego;
        this.posiblesPronosticos = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Sala> getSalasDeJuego() {
        return salasDeJuego;
    }

    public void setSalasDeJuego(ArrayList<Sala> salasDeJuego) {
        this.salasDeJuego = salasDeJuego;
    }

    public Competencia getCompetenciaDelJuego() {
        return competenciaDelJuego;
    }

    public void setCompetenciaDelJuego(Competencia competenciaDelJuego) {
        this.competenciaDelJuego = competenciaDelJuego;
    }

    public ArrayList<ElementoPronosticable> getPosiblesPronosticos() {
        return posiblesPronosticos;
    }

    public void setPosiblesPronosticos(ArrayList<ElementoPronosticable> posiblesPronosticos) {
        this.posiblesPronosticos = posiblesPronosticos;
    }
}
