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
        
        //suma de valores con el metodo reduce
        System.out.printf("%nSuma mediante el metodo reduce: %d%n", IntStream.of(valores).reduce(0, (x,y) -> x + y));
        
        //suma de cadros de lso valores con el metodo reduce
        System.out.printf("Suma de cuadrados mediante el metodo reduce: %d%n", IntStream.of(valores).reduce(0, ( x,y) -> x + y * y));
        
        //producto de los valores con el metodo reduce
        System.out.printf("Producto mediante el metodo reduce: %d%n", IntStream.of(valores).reduce(1, (x, y) -> x * y));
        
        //Valores pares mostrados en orden
        System.out.printf("%nValores pares mostrados en orden: ");
        IntStream.of(valores)
                            .filter(valor -> valor % 2 == 0)
                            .sorted()
                            .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();
        
        //valores impares multiplicados por 10 y mostrados en orden
        System.out.printf("Valores imPares multiplicados por 10 y mostrados en orden: ");
        IntStream.of(valores)
                            .filter(valor -> valor % 2 != 0)
                            .map(valor -> valor * 10)
                            .sorted()
                            .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();
        
        //suma el rango de enteros del 1 al 10, exclusivo
        System.out.printf("%nSuma de enteros del 1 al 9: %d%n", IntStream.range(1, 10).sum());
        
        //suma el rango de enteros de 1 al 10, inclusivo
        System.out.printf("Suma de enteros del 1 al 10: %d%n",
                        IntStream.rangeClosed(1, 10).sum());
        
        
        
    }
}
  