package arregloconnumerodeargumentosdinamico;

/**
 *
 * @author Genarogg
 */

public class Main {
    public static double promedio(double... numeros){
        double total = 0.0;
        
        for(double numero : numeros){
            total += numero;
        }
        return total / numeros.length;
    }
    
    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 30.0;
        
        System.out.printf("d1 = %.0f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f",d1 , d2, d3, d4);
        System.out.println("");
        
        System.out.printf("el promedio de d1 y d2 es %.1f%n", promedio(d1, d2));
        
        System.out.printf("El promedio de d1, d2 y d3 es %.1f%n", promedio(d1, d2, d3));
        
        System.out.printf("El promedio de d1, d2, d3 y d4 es %.1f%n", promedio(d1,d2,d3,d4));
        
    }
    
}
