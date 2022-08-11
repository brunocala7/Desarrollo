public class MejoresJugadores {

    private int id;
    private Jugador mejorJugadorPronosticado;
    private Jugador mejorArqueroPronosticado;
    private Jugador mejorJugador;
    private Jugador mejorArquero;

    public MejoresJugadores(int id, Jugador mejorJugadorPronosticado, Jugador mejorArqueroPronosticado, Jugador mejorJugador, Jugador mejorArquero) {
        this.id = id;
        this.mejorJugadorPronosticado = mejorJugadorPronosticado;
        this.mejorArqueroPronosticado = mejorArqueroPronosticado;
        this.mejorJugador = mejorJugador;
        this.mejorArquero = mejorArquero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jugador getMejorJugadorPronosticado() {
        return mejorJugadorPronosticado;
    }

    public void setMejorJugadorPronosticado(Jugador mejorJugadorPronosticado) {
        this.mejorJugadorPronosticado = mejorJugadorPronosticado;
    }

    public Jugador getMejorArqueroPronosticado() {
        return mejorArqueroPronosticado;
    }

    public void setMejorArqueroPronosticado(Jugador mejorArqueroPronosticado) {
        this.mejorArqueroPronosticado = mejorArqueroPronosticado;
    }

    public Jugador getMejorJugador() {
        return mejorJugador;
    }

    public void setMejorJugador(Jugador mejorJugador) {
        this.mejorJugador = mejorJugador;
    }

    public Jugador getMejorArquero() {
        return mejorArquero;
    }

    public void setMejorArquero(Jugador mejorArquero) {
        this.mejorArquero = mejorArquero;
    }

    public boolean verificarResultado(){
        if(mejorArquero == mejorArqueroPronosticado && mejorJugador == mejorJugadorPronosticado){
            return true;
        }
        return false;
    }
}
