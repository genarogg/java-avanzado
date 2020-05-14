public class IntStreamClass {
    
}package IntStreamClass;

import java.util.stream.IntStream;

/**
 *
 * @author Genarogg
 */
public class IntStreamClass {
    public static void main(String[] args) {
        //origen de datos
        int [] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        
        //muestra los valores originales
        System.out.print("Valores originales: ");
        
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();
        
        
    }
}
  