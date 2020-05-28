package Venta;

/**
 *
 * @author Genarogg
 */
public class PuntoDeVenta {
    public static void main(String[] args) {
        Producto producto = new Producto(20, "Jabon");
        Sucursal sucursal1 = new Sucursal(producto);
        
        Thread javier = new Thread(sucursal1, "Javier Vazquez");
        Thread francisco = new Thread(sucursal1, "Francisco Gonzalez");
        Thread alfonso = new Thread(sucursal1, "Alfonso Arteaga");
        Thread jose = new Thread(sucursal1, "Jose Vascoselos");
        Thread ramiro = new Thread(sucursal1, "Ramiro Bronco");
        Thread samuel = new Thread(sucursal1, "Samuel Jose");
        
        javier.start();
        francisco.start(); 
        alfonso.start();
        jose.start();
        ramiro.start();
        samuel.start();
        
    }
}