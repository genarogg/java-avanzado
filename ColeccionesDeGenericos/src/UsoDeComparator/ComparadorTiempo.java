public class ComparadorTiempo {
    
}package UsoDeComparator;

import java.util.Comparator;

/**
 *
 * @author Genarogg
 */
public class ComparadorTiempo implements Comparator<Tiempo> {
   
    @Override
    public int compare(Tiempo tiempo1, Tiempo tiempo2){
        
        int diferenciaHora = tiempo1.getHora() - tiempo2.getHora();
        if(diferenciaHora != 0){
            return diferenciaHora;
        }
        
        int diferenciaMinuto = tiempo1.getMinuto() - tiempo2.getMinuto();
        if(diferenciaMinuto != 0){
            return diferenciaMinuto;
        }
        
        int diferenciaSegundo = tiempo1.getSegundo() - tiempo2.getSegundo();
        return diferenciaSegundo;
    }
}
