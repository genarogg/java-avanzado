package EjercicioConArreglos1;

/**
 *
 * @author genarogg
 */
public class LibroCalificaciones {
    private String nombreDelCurso;
    private int [][] calificaciones;

    public LibroCalificaciones(String nombreDelCurso, int[][] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    public LibroCalificaciones() {
    }
    
    
    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[][] calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public void procesarCalificaciones(){
        //imprime el arreglo de calificaciones
        imprimirCalificaciones();
        
        //llamada a los metodos obtener minima y maxima calificacion
        System.out.printf("%n%s %d%n%s %d",
                          "La calificacion mas baja en el libro de calificaciones es:",
                           obtenerNotaMinima(),
                           "La calificacion mas alta en el libro de calificaciones es:",
                           obtenerNotaMaxima());
        System.out.println("");
        
        //imprime grafico de distribucion de todas las calificaciones para todas ls pruebas
        imprimirGraficoDeBarras();
    }
    
   
 

    
   
   
}   
