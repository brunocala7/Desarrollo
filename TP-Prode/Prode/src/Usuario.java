import java.util.Date;

public class Usuario {
    private int id;
    private String nombreUsuario;
    private Date fechaCreacion;

    public Usuario(int id, String nombreUsuario, Date fechaCreacion) {
        this.id= id;
        this.nombreUsuario= nombreUsuario;
        this.fechaCreacion= fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
