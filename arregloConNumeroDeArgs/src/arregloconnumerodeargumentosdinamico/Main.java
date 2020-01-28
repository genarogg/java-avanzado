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
        
        
    }
    
}
