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
    
    public int obtenerNotaMinima(){
        //asuma que el primer elemento de arreglo calificaciones es el mas bajo
        int calificacionBaja = calificaciones[0][0];
        
        //itera a traves de las filas del arreglo calificaciones
        for (int[] calificacionesDeEstudiantes : calificaciones) {
            //si la calificacion es mayor que calificacion baja, la asigna a calificacion baja
            for(int calificacion : calificacionesDeEstudiantes){
                if(calificacion < calificacionBaja){
                    calificacionBaja = calificacion;
                }
            }
        }
        return calificacionBaja;
    }
    public int obtenerNotaMaxima(){
        //asuma que el primer elemento del arreglo calificaciones es el mas alto
        int calificacionAlta = calificaciones[0][0];
        
        //itera a traves de las filas del arreglo calificaciones
        for(int[]califEstudiantes : calificaciones){
            //itera a traves de las columnas de la fila actual
            for(int calificacion : califEstudiantes){
                //si la calificacion es mayor que caliAlta, la asigna a caliAlta
                if(calificacion > calificacionAlta){
                    calificacionAlta = calificacion;
                }
            }
        }
        return calificacionAlta;
    }

    
   
   
}   
