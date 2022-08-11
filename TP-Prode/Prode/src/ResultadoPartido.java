public class ResultadoPartido extends ElementoPronosticable {

    private Partido partido;
    private int golesApostadosLocal;
    private  int golesApostadosVisitante;
    private String resultado;

    public ResultadoPartido(int id, String nombre, String estado, int puntosQueOtorga,Partido partido, int golesApostadosLocal, int golesApostadosVisitante, String resultado) {
        super(id, nombre, estado, puntosQueOtorga);
        this.partido = partido;
        this.golesApostadosLocal = golesApostadosLocal;
        this.golesApostadosVisitante = golesApostadosVisitante;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getGolesApostadosLocal() {
        return golesApostadosLocal;
    }

    public void setGolesApostadosLocal(int golesApostadosLocal) {
        this.golesApostadosLocal = golesApostadosLocal;
    }

    public int getGolesApostadosVisitante() {
        return golesApostadosVisitante;
    }

    public void setGolesApostadosVisitante(int golesApostadosVisitante) {
        this.golesApostadosVisitante = golesApostadosVisitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public boolean verificarResultado(){
        if(partido.getResultado() == this.resultado){
            return true;
        }
        return false;
    }
}
