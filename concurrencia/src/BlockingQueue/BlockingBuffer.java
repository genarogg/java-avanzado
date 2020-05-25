package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Creacion de un buffer sincronizando usando un ArrayBlockinQueue
 * @author Genarogg
 */
public class BlockingBuffer implements Buffer{
    private final ArrayBlockingQueue<Integer> buffer;
    
    public BlockingBuffer(){
        buffer = new ArrayBlockingQueue<Integer>(1);
    }

   
}
