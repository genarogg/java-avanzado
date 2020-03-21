package EjercicioConArreglos1;

/**
 *
 * @author genarogg
 */
public class Main {
    public static void main(String[] args) {
        int [][] arregloCalificaciones = {{87,96,70},{68,87,90},
                                          {94,100,90},{100,81,82},
                                          {83,65,85},{78,87,65},
                                          {85,75,83},{91,93,84},
                                          {87,93,73}};
        
        LibroCalificaciones miLibroDeCalificaciones = new LibroCalificaciones("Arreglo multidimencional", arregloCalificaciones);
        System.out.printf("Bienvenido al libro de calificaciones para %n%s%n%n", miLibroDeCalificaciones.getNombreDelCurso());
        miLibroDeCalificaciones.procesarCalificaciones();
    }
}
