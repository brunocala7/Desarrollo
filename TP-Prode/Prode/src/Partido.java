import java.util.Date;

public class Partido {

    private int id;
    private Seleccion seleccioLocal;
    private Seleccion seleccionVisitante;
    private int golesLocales;
    private int golesVisitantes;
    private Date fechaPartido;
    private String ronda;
    private String grupo;
    private String resultado;

    public Partido(int id, Seleccion seleccioLocal, Seleccion seleccionVisitante, int golesLocales, int golesVisitantes, Date fechaPartido, String ronda, String grupo, String resultado) {
        this.id = id;
        this.seleccioLocal = seleccioLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.golesLocales = golesLocales;
        this.golesVisitantes = golesVisitantes;
        this.fechaPartido = fechaPartido;
        this.ronda = ronda;
        this.grupo = grupo;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seleccion getSeleccioLocal() {
        return seleccioLocal;
    }

    public void setSeleccioLocal(Seleccion seleccioLocal) {
        this.seleccioLocal = seleccioLocal;
    }

    public Seleccion getSeleccionVisitante() {
        return seleccionVisitante;
    }

    public void setSeleccionVisitante(Seleccion seleccionVisitante) {
        this.seleccionVisitante = seleccionVisitante;
    }

    public int getGolesLocales() {
        return golesLocales;
    }

    public void setGolesLocales(int golesLocales) {
        this.golesLocales = golesLocales;
    }

    public int getGolesVisitantes() {
        return golesVisitantes;
    }

    public void setGolesVisitantes(int golesVisitantes) {
        this.golesVisitantes = golesVisitantes;
    }

    public Date getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
