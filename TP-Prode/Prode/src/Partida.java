import java.util.ArrayList;

public class Partida {
    private int id;
    private Juego juego;
    private ArrayList<ElementoPronosticable> elementosPronosticables;

    public Partida(int id, Juego juego) {
        this.id = id;
        this.juego = juego;
        this.elementosPronosticables = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public ArrayList<ElementoPronosticable> getElementosPronosticables() {
        return elementosPronosticables;
    }

    public void setElementosPronosticables(ArrayList<ElementoPronosticable> elementosPronosticables) {
        this.elementosPronosticables = elementosPronosticables;
    }

    public int puntosTotales(){
        int puntos = 0;
        for (ElementoPronosticable elementoPronosticable : elementosPronosticables) {
            if(elementoPronosticable.verificarResultado() == true){
                puntos += elementoPronosticable.getPuntosQueOtorga();
            }
        }
        return puntos;  
    }
}
