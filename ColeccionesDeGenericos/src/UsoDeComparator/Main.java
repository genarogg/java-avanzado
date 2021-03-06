package UsoDeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Genarogg
 */
public class Main {
    public static void main (String [] args){
        List<Tiempo> lista = new ArrayList<>();
                lista.add(new Tiempo(6,24, 34));

        lista.add(new Tiempo(6,24, 34));
        lista.add(new Tiempo(18, 14, 58));
        lista.add(new Tiempo(6, 05, 34));
        lista.add(new Tiempo(12, 14, 58));
        lista.add(new Tiempo(6, 24, 22));
        
        //imprime los elementos del objeto List
        System.out.printf("Elementos del arreglo desordenados: %n%s%n", lista);
        
        //ordena usando un comparador
        Collections.sort(lista, new ComparadorTiempo());
        
        //Imprime los elementos del objeto List
        System.out.printf("Elementos de la lista ordenados: %n%s%n", lista);
    }
}
