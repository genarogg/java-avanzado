package shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Genarogg
 */
public class MazoDeCartas {
    private List<Carta> listaCartas; //declara objeto List que almacenará los objetos Carta
    
    //establece mazo de objetos Carta
    public MazoDeCartas(){
        Carta[] mazo = new Carta[52]; //un mazo tiene 52 cartas
        int cuenta = 0; //número de cartas
        
        //llena el mazo con objetos Carta
        for (Carta.Palo palo : Carta.Palo.values()) {
            for (Carta.Cara cara : Carta.Cara.values()) { 
                mazo[cuenta] = new Carta(cara, palo);
                ++cuenta;
            }
        }
        
        listaCartas = Arrays.asList(mazo);
        Collections.shuffle(listaCartas);
    }
    
 
    
}