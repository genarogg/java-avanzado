package PruebaDeProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Genarogg
 */
public class PruebaDeProperties {
    public static void main(String[] args) {
        Properties props = new Properties();
        
        //establece las propiedades
        props.setProperty("color", "azul");
        props.setProperty("anchura", "200");
        
        System.out.println("Despues de establecer propiedades");
        listarPropiedades(props);
        
        
    
   
   
    
   
}
