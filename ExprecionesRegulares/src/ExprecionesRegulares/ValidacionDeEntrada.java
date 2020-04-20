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
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba el primer nombre");
        String primerNombre = scanner.nextLine();
        
        System.out.println("Escribe el apellido paterno");
        String apellidoPaterno = scanner.nextLine();
        
        System.out.println("Escriba la direccion");
        String direcion = scanner.nextLine();
        
        System.out.println("Escriba la ciudad");
        String ciudad = scanner.nextLine();
        
        System.out.println("Escriba el estado");
        String estado = scanner.nextLine();
        
        System.out.println("Escriba el codigo postal");
        String cp = scanner.nextLine();
        
        System.out.println("Escriba el telefono");
        String telefono = scanner.nextLine();
        
        System.out.println("\nValidar Resultados:");
        
        if(!validacionDelPrimerNombre(primerNombre)){
            System.out.println("Primer nombre invalido");
        }
        else if(!validarApellidoPaterno(apellidoPaterno)){
            System.out.println("Primer apellido invalido");
        }
        else if(!validarDireccion(direcion)){
            System.out.println("Direccion invalida");
        }
        else if(!validarCiudad(ciudad)){
            System.out.println("Ciudad invalida");
        }
        else if(!validarEstado(estado)){
            System.out.println("Estado invalido");
        }
        else if(!validarCP(cp)){
            System.out.println("Codigo postal invalido");
        }
        else if(!validarTelefono(telefono)){
            System.out.println("Numero telefonico invalido");
        }
        else if(validacionDelPrimerNombre(primerNombre) && 
                validarApellidoPaterno(apellidoPaterno) && 
                validarDireccion (direcion) && 
                validarCiudad(ciudad) && 
                validarEstado(estado) &&
                validarCP(cp) &&
                validarTelefono(telefono)
                ){
            System.out.println("La entrada es valida. Gracias");
        }
    }
}
