public class Jugador {

    private int id;
    private String nombre;
    private String posicion;
    private String urlFotoJugador;

    public Jugador(int id, String nombre, String posicion, String urlFotoJugador) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
        this.urlFotoJugador = urlFotoJugador;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getUrlFotoJugador() {
        return urlFotoJugador;
    }

    public void setUrlFotoJugador(String urlFotoJugador) {
        this.urlFotoJugador = urlFotoJugador;
    }
}
