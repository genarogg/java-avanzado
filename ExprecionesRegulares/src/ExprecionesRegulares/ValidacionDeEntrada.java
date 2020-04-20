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
    
    public static boolean validarApellidoPaterno(String apellidoPaterno){
        return apellidoPaterno.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
    }
    
 
   
    
    public static void main(String[] args) {
        
    }
}
