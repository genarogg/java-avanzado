package ordenamiento;

import java.security.SecureRandom;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 *
 * @author Genarogg
 */
public class ComparacionOrdenamiento {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        
        int[] array1 = random.ints(15_000_000).toArray();
        int[] array2 = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        
        //Tiempo de ordenamiento del array1 con el metodo sort de Arrays
        Instant sortStart = Instant.now();
        Arrays.sort(array1);
        Instant sortEnd = Instant.now();
        
        
        
    
    }   
            
            
}
