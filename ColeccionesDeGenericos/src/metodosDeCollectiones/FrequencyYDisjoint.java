package metodosDeCollectiones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Genarogg
 */
public class FrequencyYDisjoint {
    public static void main(String[] args) {
       //Inicializa la lista1 y lista2
       String[] colores = {"rojo", "blanco", "amarillo", "azul"};
       List <String> lista1 = Arrays.asList(colores);
       ArrayList <String> lista2 = new ArrayList<>();
       
       lista2.add("negro");
       lista2.add("rojo");
       lista2.add("verde");
       
        System.out.print("antes de addAll, lista2 contiene: ");
        
        //Muestra los elementos de lista2
        for(String s : lista2){
            System.out.print(" " + s);
        }
        
        Collections.addAll(lista2, colores);//agrega los objetos String de colores a lista2
        
        System.out.println();
        
        System.out.print("Despues de addAll, lista2 contiene: ");
        for(String s : lista2){
            System.out.print(" " + s);
        }
        
        //obtiene la frecuencia de rojo
        int frecuencia = Collections.frequency(lista2, "rojo");
        System.out.printf("%nFrecuencia de rojo en lista2: %d%n", frecuencia);
        
        //comprueba si lista1 y lista2 tienen elementos en comun
        boolean desunion = Collections.disjoint(lista1, lista2);
        
        System.out.printf("lista1 y lista2 %s elementos en comun%n", desunion ? "no tiene" : "tiene");
    }
}
