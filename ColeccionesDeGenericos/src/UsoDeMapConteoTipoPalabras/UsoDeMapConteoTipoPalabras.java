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
        
        //procesamiento del texto de entrada{
        for(String token : tokens){
            String palabra = token.toLowerCase(); //Pasa todo a minunculas
            
            //Si el mapa contiene la palabra
            if(map.containsKey(palabra)){ 
                int cuenta = map.get(palabra);//obtiene la cuenta actual
                map.put(palabra, cuenta + 1);
            }
            else{
                map.put(palabra, 1);
            }
        }
        
    }
    //Este metodo muestra el contenido del mapa 
    private static void mostrarMap(Map<String, Integer> map){
        Set<String> claves = map.keySet();//Obtiene las claves
        //ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        
        System.out.printf("%nEl mapa contiene: %nClave\t\tValor%n");
        //Genera la salida para cada clave en el mapa
        for(String clave :clavesOrdenadas){
            System.out.printf("%-10s%10s%n", clave, map.get(clave));
        }
        System.out.printf("Tamaño: %d%n¿vacio?: %b%n", map.size(), map.isEmpty());
        
    }
}
