package ExprecionesRegulares;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */
public class ValidacionDeEntrada {
    
    public static boolean validacionDelPrimerNombre(String primerNombre){
        return primerNombre.matches("[A-Z][a-zA-Z]*");
    }
    

   
    
    public static void main(String[] args) {
        
    }
}
