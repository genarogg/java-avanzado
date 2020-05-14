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
        
        //cuenta, min, max, suma y promedio
        System.out.printf("%nCuenta: %d%n", IntStream.of(valores).count());
        System.out.printf("Min: %d%n", IntStream.of(valores).min().getAsInt());
        System.out.printf("max: %d%n", IntStream.of(valores).max().getAsInt());
        System.out.printf("Suma: %d%n", IntStream.of(valores).sum());
        System.out.printf("Promedio: %.2f%n", IntStream.of(valores).average().getAsDouble());
        System.out.printf("Summaary static: %s", IntStream.of(valores).summaryStatistics());
        
        
    }
}
  