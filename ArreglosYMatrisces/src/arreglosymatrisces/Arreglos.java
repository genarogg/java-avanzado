package arreglosymatrisces;

/**
 *
 * @author genarogg
 */
public class Arreglos {
    public static void main(String[] args) {
        int [] arregloA = new int [5];
        int [] arregloB = {0,0,0,0,0};
        
        arregloA[2] = 3;
        arregloB[3] = 4;
        
        arregloA[arregloB[3]] = 5;
        
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("La pocision del arregloA " + i + " tiene el valor " + arregloA[i]);
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("La pocision del arregloB " + i + " tiene el valor " + arregloB[i]);
        }
        
    }
}
