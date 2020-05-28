package Venta;

/**
 *
 * @author Genarogg
 */
public class Sucursal implements Runnable {
    Producto prod;

    public Sucursal(Producto prod) {
        this.prod = prod;
    }
    
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            
            try {
                venderProducto(2);
                Thread.sleep(500);
                
                if(prod.getExistencia() < 0){
                    System.out.println("Existen inconsistencias en la existencia del producto");
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
    
    private synchronized void venderProducto(int cantidadVendida){
        //synchronized(this){} -> Para un solo Bloque
        if(prod.getExistencia() >= cantidadVendida){
            System.out.printf("La existencia del producto %s es %d%n",
                                prod.getNombreProd(), prod.getExistencia());
            
            System.out.printf("El cajero que realiza la centa es: %s%n",
                                Thread.currentThread().getName());
            
            prod.venderProducto(cantidadVendida);
            
            System.out.println("Venta realizada. Nueva existencia: " + prod.getExistencia());
        }
        
    }
}
