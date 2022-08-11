public abstract class ElementoPronosticable {
    private int id;
    private String nombre;
    private String estado;
    private int puntosQueOtorga;

    public ElementoPronosticable(int id, String nombre, String estado, int puntosQueOtorga) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.puntosQueOtorga = puntosQueOtorga;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPuntosQueOtorga() {
        return puntosQueOtorga;
    }

    public void setPuntosQueOtorga(int puntosQueOtorga) {
        this.puntosQueOtorga = puntosQueOtorga;
    }

    
    public boolean verificarResultado(){

        return true;
    }
}
