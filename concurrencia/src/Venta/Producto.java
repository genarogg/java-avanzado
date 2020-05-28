package Venta;

/**
 *
 * @author Genarogg
 */
public class Producto {
    private int existencia;
    private String nombreProd;

    public Producto(int existencia, String nombreProd) {
        this.existencia = existencia;
        this.nombreProd = nombreProd;
    }

    public int getExistencia() {
        return existencia;
    }

    public String getNombreProd() {
        return nombreProd;
    }
    
    public void venderProducto(int cantidadVendida){
        existencia -= cantidadVendida;
    }
}
