import java.util.ArrayList;

public class Pronosticador {

    private Usuario usuario;
    private ArrayList<Partida> partidas;

    public Pronosticador(Usuario usuario) {
        this.usuario = usuario;
        this.partidas = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public int puntosTotales(){
        int puntos = 0;
        for (Partida partida : partidas) {
            puntos += partida.puntosTotales();
        }
        return puntos;
    }
}
