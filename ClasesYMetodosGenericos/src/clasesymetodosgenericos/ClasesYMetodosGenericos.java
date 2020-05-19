package clasesymetodosgenericos;

/**
 *
 * @author Genarogg
 */
public class ClasesYMetodosGenericos {

  
    public static <T> void imprimirArreglo(T[] arreglo){
        //Imprimir elementos del arreglo
        for(T numero : arreglo){
            System.out.printf("%s ", numero);
        }
        System.out.println();
    }
    
    
   