import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String [ ] args) {
        int numero1 = 0;
        int numero2 = 0;
        int i = 0;
        String operador = "";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        boolean exit = true;

        Operaciones operacion = new Operaciones(0,0,"");

        while(true){
            try{
                System.out.println("\nIngrese el primer numero");
                numero1 = scanner.nextInt();
                System.out.println("Ingrese el operador (* - / +)");
                operador = scanner2.nextLine();
                System.out.println("Ingrese el segundo numero");
                numero2 = scanner.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Debe ingresar un número");
                break;
            }


            operacion.setNumero1(numero1);
            operacion.setOperador(operador);
            operacion.setNumero2(numero2);


            int resultado = 0;

            try{
                resultado = operacion.realizarOperacion();
                System.out.println("Resultado: " + resultado);
            } catch (Throwable e) {
                System.out.println(e);


            }


            i++;
        }


    }

}
