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
    
    
   
 

    
   
   
}   
