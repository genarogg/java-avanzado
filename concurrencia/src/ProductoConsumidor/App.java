package ProductoConsumidor;

/**
 *
 * @author Genarogg
 */
public class App {
    public static void main(String[] args) {
        Buffer2 b = new Buffer2();
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        
        Thread tProd = new Thread(p);
        Thread tCons = new Thread(c);
        
        tProd.start();
        tCons.start();
    }
}
