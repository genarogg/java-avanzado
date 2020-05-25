package BlockingQueue;

/**
 *
 * @author Genarogg
 */
public interface Buffer {
    public void blockingPut(int value) throws InterruptedException;
    
    public int blockingGet() throws InterruptedException;
}
public class Buffer {
    
}