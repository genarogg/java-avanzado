package strings;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */
public class PruebaDeToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba un enunciado y oprima enter");
        String enunciado = scanner.nextLine();
        
        //procesa el enunciado del usuario
        String [] tokens = enunciado.split(" ");
        System.out.printf("Numero de elementos: %d%nLos tokens son: %n",tokens.length);
        
        for(String token : tokens){
            System.out.println(token);
        }
    }   
}
