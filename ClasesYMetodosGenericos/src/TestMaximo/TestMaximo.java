package TestMaximo;

/**
 *
 * @author Genarogg
 */
public class TestMaximo {
    public static void main(String[] args) {
        System.out.printf("Máximo de %d, %d y %d es %d%n%n", 3, 4, 5, (Integer) maximo(3, 4, 5));
        System.out.printf("Maximo de %.1f %.1f, %.1f es %.1f%n%n", 6.6, 8.8, 56.5, (Double) maximo(6.6, 8.8, 56.5));
        System.out.printf("Maximo de %s, %s, y %s es %s%n", "pera", "manzana", "naranja", maximo("pera", "manzana", "naranja"));
    }
    public static <T extends Comparable<T>> T maximo(T x, T y, T z){
        T max = x; //asumiendo que x es el mas grande.
        
        if(y.compareTo(max) > 0 ){
            max = y; //y es el numero maxiom
        }
        
        if(z.compareTo(max) > 0){
            max = z; //z es el valor mayor
        }
        
        return max;
    }
}
