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
    
    public static boolean validarDireccion(String direccion){
        return direccion.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public static boolean validarCiudad(String ciudad){
        return ciudad.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public static boolean validarEstado(String estado){
        return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public static boolean validarCP(String cp){
        return cp.matches("\\d{5}");
    }
    
    public static boolean validarTelefono(String telefono){
        return telefono.matches("[0-9]\\d{2}-[0-9]\\d{2}-\\d{4}");
    }
    
    public static void main(String[] args) {
        
    }
}
