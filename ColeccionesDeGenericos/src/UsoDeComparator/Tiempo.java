package UsoDeComparator;

/**
 *
 * @author Genarogg
 */
public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(){
        this(0, 0, 0);
    }
    public Tiempo(int hora){
        this(hora, 0, 0);
    }
    public Tiempo(int hora, int minuto){
        this(hora, minuto, 0);
    }
    
    public Tiempo(int hora, int minuto, int segundo){
        if(hora < 0 || hora >= 24){
            throw new IllegalArgumentException("hora debe estar entre cero y 23");
        }
        if( minuto < 0 || minuto >= 60){
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
        }
        if(segundo < 0 || segundo >= 60){
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    //valida y establec la hora
    public void setHora(int hora){
        if(hora < 0 || hora >= 24){
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");
        }
        this.hora = hora;
    }
    
    public void setMinuto(int minuto){
        if(minuto < 0 || minuto >= 60){
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
        }
        this.minuto = minuto;
    }
    
 
   
    
}
