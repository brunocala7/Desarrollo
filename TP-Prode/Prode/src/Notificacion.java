import java.util.ArrayList;

public class Notificacion {
    private Juego juegoANotificar;
    private String mensaje;
    private ArrayList<Pronosticador> pronosticadoresAfectados;

    public Notificacion(Juego juegoANotificar, String mensaje) {
        this.juegoANotificar = juegoANotificar;
        this.mensaje = mensaje;
        this.pronosticadoresAfectados = new ArrayList<>();
    }

    public Juego getJuegoANotificar() {
        return juegoANotificar;
    }

    public void setJuegoANotificar(Juego juegoANotificar) {
        this.juegoANotificar = juegoANotificar;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<Pronosticador> getPronosticadoresAfectados() {
        return pronosticadoresAfectados;
    }

    public void setPronosticadoresAfectados(ArrayList<Pronosticador> pronosticadoresAfectados) {
        this.pronosticadoresAfectados = pronosticadoresAfectados;
    }

    public void noticar(){
        for (Pronosticador pronosticador : pronosticadoresAfectados) {
            System.out.println(mensaje);;
        }
    }
}
