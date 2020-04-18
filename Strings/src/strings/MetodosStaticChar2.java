package strings;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */
public class MetodosStaticChar2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        
        //obtiene la raiz
        System.out.println("Escribe una raiz");
        int raiz = scanner.nextInt();
        
        //obtiene la selecion del usuario
        System.out.printf("Seleccione una opcion: $n1 -- %s%n2 -- %s%n",
                          "convertir digito a caracter",
                          "convertir caracter a digito");
        int opcion = scanner.nextInt();
        
        //procesa la peticion
        switch(opcion){
            case 1:{//convierte digito a caracter
                System.out.println("Escribe un digito:");
                break;
            } 
            case 2:{//convierte caracter a digito
                System.out.println("Escriba un caracter:");
                char caracter = scanner.next().charAt(0);
                System.out.printf("convertir caracter a digito: %s%n", Character.digit(caracter, raiz));
            }
        }
        
    }
    
    
}
