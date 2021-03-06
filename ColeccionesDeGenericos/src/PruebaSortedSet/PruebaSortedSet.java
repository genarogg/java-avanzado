package PruebaSortedSet;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Genarogg
 */
public class PruebaSortedSet {
    public static void main(String[] args) {
        //Crea un TreeSet del arreglo colores 
        String [] colores = {"amarilo", "verde", "negro", "carne", "gris",
                             "blanco", "naranja", "rojo", "verde"};
        
        SortedSet<String> arbol = new TreeSet<>(Arrays.asList(colores));
        
        System.out.print("Conjunto ordenado: ");
        imprimirConjunto(arbol);
        
        //obtiene subconjunto mediante headSet, con base en "naranja
        System.out.print("headSet (\"naranja\")");
        imprimirConjunto(arbol.headSet("naranja"));
        
        //se obtiene un subconjunto mediante tailSet, con base en "naranja"
        System.out.print("tailSet(\"naranja\"");
        imprimirConjunto(arbol.tailSet("naranja"));
        
        //obtiene los elementos primero y ultimo
        System.out.printf("primero: %s%n", arbol.first());
        System.out.printf("ultimo: %s%n", arbol.last());
        
        }
    
        public static void imprimirConjunto(SortedSet<String> conjunto){
            for(String s : conjunto){
                System.out.printf("%s ", s);
            }
            
            System.out.println();
    }
}
