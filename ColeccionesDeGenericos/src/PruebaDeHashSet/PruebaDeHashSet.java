package PruebaDeHashSet;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Genarogg
 */
public class PruebaDeHashSet {
   

    public static void imprimirSinDuplicados(Collection<String> valores){
        //Crea un objeto HashSet
        HashSet<String> conjunto =new HashSet<>(valores);
        System.out.printf("%nLos valores sin duplicados son: ");
        
        for(String valor : conjunto){
            System.out.printf("%s ", valor);
        }
        System.out.println("");
    }
}
