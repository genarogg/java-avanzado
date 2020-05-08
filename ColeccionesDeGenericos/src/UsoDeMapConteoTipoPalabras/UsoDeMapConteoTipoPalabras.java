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
    
   
    
}
