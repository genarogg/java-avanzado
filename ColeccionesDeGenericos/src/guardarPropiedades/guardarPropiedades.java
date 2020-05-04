package PruebaPiorityQueue;

import java.util.PriorityQueue;

/**
 *
 * @author Genarogg
 */
public class PruebaPiorityQueue {
    public static void main(String[] args) {
        //cola con capcidad de 11
        PriorityQueue<Double> cola = new PriorityQueue<>();
        
        //inserta elementos en la cola
        cola.offer(3.2);
        cola.offer(9.8);
        cola.offer(5.4);
        cola.offer(4.8);
        
        while(cola.size() > 0){
            System.out.printf("Elementos en la cola: %s %n", cola);
            
            System.out.println("peek: " + cola.peek());
            System.out.println("poll: " + cola.poll());
        }
        
        System.out.println( );
    }
}
