/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Genarogg
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService e = Executors.newCachedThreadPool();
        
        Buffer b = new BlockingBuffer();
        
        e.execute(new Producer(b));
        e.execute(new Consumer(b));
        
        e.shutdown();
        e.awaitTermination(1, TimeUnit.MINUTES);
    }
}
