package concurrencia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Genarogg
 */
public class Main {
    public static void main(String[] args) {
        //creamos tres objetos impresores
        ImpresorDeTareas tarea1 = new ImpresorDeTareas("Tarea1");
        ImpresorDeTareas tarea2 = new ImpresorDeTareas("Tarea2");
        ImpresorDeTareas tarea3 = new ImpresorDeTareas("Tarea3");
        
        System.out.println("Iniciando el executor");
        
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        //iniciar las tres tareas
        executorService.execute(tarea1);
        executorService.execute(tarea2);
        executorService.execute(tarea3);
        
        executorService.shutdown();
        
        System.out.printf("Tareas iniciadas, metodos main Finalizado %n%n");
    }
}
