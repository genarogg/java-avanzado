/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesarEmpleados;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;



/**
 *
 * @author Genarogg
 */
public class ProcesarEmpleados {
    public static void main(String[] args) {
        Empleados [] empleados = {
        new Empleados("Jared", "Rojo", "TI", 5000),
        new Empleados("Javier", "Vazquez", "TI", 7600),
        new Empleados("Oyuky", "Navarro", "Gerencia", 10000),
        new Empleados("Oyuky", "Vazquez", "Cocina", 5000),
        new Empleados("Gabriela", "Prieto", "Limpieza", 5000),
        new Empleados("Vianney", "Rodriguez", "Recursos Humanos", 6500),
        new Empleados("Francisco", "Echavarria", "Direccion", 50000),
        new Empleados("Irma", "Dominguez", "Ventas", 7500),
        new Empleados("Antonio", "Olivares", "Marketing", 100000)        
    };
    
        //Obtiene una vista List de los objetros Empleados
        List<Empleados> lista = Arrays.asList(empleados);

      
      
       
        
            
    
}
