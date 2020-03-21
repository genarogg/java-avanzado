package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Genargg
 */
public class BloqueTryCatch {
    
    public static int cociente(int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        boolean continuarCiclo = true;
        
        do{
            try{
                System.out.print("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.print("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();
                
                int resultado = cociente(numerador, denominador);
                System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
                continuarCiclo = false;    
                
            }
            catch(InputMismatchException inputMismatchException){
                System.err.printf("%nException: %s%n", inputMismatchException);
                explorador.nextLine();
            }
            catch(ArithmeticException arithmeticException){
                System.err.printf("%nExcepcion: %s%n", arithmeticException);
            }
            
        }while(continuarCiclo);
    }
}
