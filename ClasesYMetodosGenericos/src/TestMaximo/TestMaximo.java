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
    
}
