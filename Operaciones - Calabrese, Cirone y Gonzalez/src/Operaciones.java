import javax.naming.OperationNotSupportedException;
import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Objects;

public class Operaciones {
    private int numero1;
    private int numero2;
    private String operador;

    public Operaciones(int numero1, int numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }

    public int realizarOperacion() throws Throwable{
        int resultado = 0;

        if(Objects.equals(operador, "+")){
            resultado = numero1 + numero2;
        }
        else if(Objects.equals(operador, "-")){
            resultado = numero1 - numero2;
        }
        else if(Objects.equals(operador, "*")){
            resultado = numero1 * numero2;
        }
        else if(Objects.equals(operador, "/")){
            resultado = numero1 / numero2;
        }
        else{
            throw new InputMismatchException("Operador no valido");
        }

        return (resultado);
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}
