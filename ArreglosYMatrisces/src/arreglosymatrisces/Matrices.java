package arreglosymatrisces;

/**
 *
 * @author genarogg
 */
public class Matrices {
    public static void main(String[] args) {
        int [][] a = new int [2][2];
        
        a[0][0] = 1;
        a[0][1] = 2;
        
        a[1][0] = 3;
        a[1][1] = 4;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);
            }
        }
        System.out.println("\n");
        
        int [][] b = {{1,2},{3,4}};
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println(b[i][j]);
            }
        }
        
    }
}
