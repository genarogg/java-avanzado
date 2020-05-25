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

    @Override
    public void blockingPut(int value) throws InterruptedException {
        buffer.put(value);
        System.out.printf("%s%2d\t%s%d%n", "El producto escribe", value,
                            "Elementos en el buffer: ", buffer.size());
    }

    @Override
    public int blockingGet() throws InterruptedException {
        int readValue = buffer.take();
        System.out.printf("%s %2d\t%s%d%n", "esl consumer lee", readValue, "Elementos en el buffer", buffer.size());
        return readValue;
    }
}
