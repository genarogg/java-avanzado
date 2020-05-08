package UsoDeMapConteoTipoPalabras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Genarogg
 */
public class UsoDeMapConteoTipoPalabras {
    public static void main(String[] args) {
        //Crea HashMap para almacinar claves String y valores Integer
        Map<String, Integer> miMap = new HashMap<>();
        
        crearMap(miMap);//crea un mapa con base en la entrada del usuario
        mostrarMap(miMap); //Muestra el contenido del mapa
        
    }
    
    //Crea un mapa a partir de la entrada del usuario
    private static void crearMap(Map<String, Integer> map){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una cadena");
        String entrada = sc.nextLine();
        
        //divide la entrada en tokens
        String [] tokens = entrada.split(" ");
        
   
        
    }
    
}
