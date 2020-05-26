/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoConsumidor;

/**
 *
 * @author Genarogg
 */
public class Consumidor implements Runnable {
    
    private Buffer2 buffer;

    public Consumidor(Buffer2 buffer) {
        this.buffer = buffer;
    }
    
    
    
    @Override
    public void run() {
        char valor;
        
        for(int i = 0; i < 10; i++){
            valor = buffer.recoger();
            System.out.println(i + " Consumidor: " + valor);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
