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
        
        //Reemplazar el valor de una propiedad
        props.setProperty("color", "rojo");
        
        System.out.println("Despues de reemplazar propiedades");
        listarPropiedades(props);
        
        guardarPropiedades(props);
        
        props.clear();
        
        System.out.println("Despues de borrar propiedades");
        listarPropiedades(props);
        
        cargarPropiedades(props);
        
        //Obtiene el valor de la propiedad "color"
        Object valor = props.getProperty("color");
        
        //comprueba si el valor esta en la tabla
        if(valor != null){
            System.out.printf("El valor de la propiedad color es: %s%n", valor);
        }
        else{
            System.out.println("La propiedad color no esta en la tabla");
        }
    }
    
   
   
    
   
}
