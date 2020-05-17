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

        //Muestra todos los objetros Empleados
            System.out.println("Lista completa de empleados: ");
            lista.stream().forEach(System.out::println);
            
        //Predicado que devuelve true para salarios en el rango $4000 - $6000
        Predicate<Empleados> cuatroASeisMil = empleado -> (empleado.getSalario() >= 4000 && empleado.getSalario() <= 6000);
        
        //Muestra los empleados con salarios en rango de $4000 a $6000
        //en orden ascendente por salario
        
        System.out.printf("%nEmpleados que ganan $4000-$6000 mensuales ordenados por salario%n");
        
        lista.stream().filter(cuatroASeisMil).sorted(Comparator.comparing(empleado -> empleado.getSalario()))
                .forEach(System.out:: println);
        
        //Muestra el primer empleado con salarios en rango de $4000 a $6000
        System.out.printf("%nPrimer empleado que gana $4000-$6000:%n%s%n",
                            lista.stream()
                            .filter(cuatroASeisMil)
                            .findFirst()
                            .get());
        
        //Funciones para obtener primer nombre y apellido de un empleado
        Function <Empleados, String> porPrimerNombre = Empleados::getPrimerNombre;
        Function <Empleados, String> porApellido = Empleados::getApellidoPaterno;
        
        //Comparartor para comparar empleados por primer nombre y luego por apellidoPaterno
        Comparator<Empleados> apellidoNombre = Comparator.comparing(porApellido).thenComparing(porPrimerNombre);
            lista.stream()
             .sorted(apellidoNombre)
             .forEach(System.out::println);
        
        //ordena empleados en forma decendente por apellido, luego por nombre
        System.out.printf("%nEmpleados en orden descendente por apellido y luego por nombre:%n");
        
        lista.stream()
             .sorted(apellidoNombre.reversed())
             .forEach(System.out::println);
        
        //muestra apellidos  de empleados unicos ordenados
        System.out.printf("%nApellidos de empleados unicos:%n");
        lista.stream()
                   .map(Empleados :: getApellidoPaterno)
                   .distinct()
                   .sorted()
                   .forEach(System.out::println);
        
        //muestra solo nombre y apellido
        System.out.printf("%nNombre de empleados en orden por apellido y luego" 
                + "por nombre:%n");
        lista.stream()
                    .sorted(apellidoNombre)
                    .map(Empleados::obtenerNombre)
                    .forEach(System.out::println);
        
        //agrupa empleados por departamento
        Map<String, List<Empleados>> agrupadoPorDepartamento =
                lista.stream()
                        .collect(Collectors.groupingBy(Empleados :: getDepartamento));
        
        agrupadoPorDepartamento.forEach(
                (departamento, empleadosEnDepartamento) ->{
                System.out.println(departamento);
                empleadosEnDepartamento.forEach(
                empleado -> System.out.printf("   %s%n", empleado)
                );
            }
        );
        
        //Cuenta el numero de empleados en cada departamento
        System.out.printf("%nConteo de empleados por departamento:%n");
        Map<String, Long> conteoEmpleadosPorDepartamento =
                lista.stream()
                        .collect(Collectors.groupingBy(Empleados::getDepartamento, TreeMap::new, 
                                                        Collectors.counting()));
        
        conteoEmpleadosPorDepartamento.forEach(
            (departamento, conteo) -> System.out.printf("%s tiene %d empleado(s)%n", departamento, conteo)
        );
        
        //suma de salarios de empleados con el metodo sum de DoubleStream
        System.out.printf("%nSuma de los salarios de los empleados (mediante el metodo sum): %.2f%n",
                            lista.stream()
                                    .mapToDouble(Empleados::getSalario)
                                    .sum()
                
            );
        
        //calcula la suma de los salarios de los empleados con metodo reduce de stream
        System.out.printf("Suma de los salarios de los empleados(metodo el metodo reduce): %.2f%n",
                            lista.stream()
                                    .mapToDouble(Empleados:: getSalario)
                                    .reduce(0, (valor1, valor2) -> valor1 + valor2)
                );
        
        //promedio de salarios de empleados con el metodo con el metodo average de DoubleStream
        System.out.printf("Promedio de salarios de los empleados: %.2f%n",
                            lista.stream()
                                    .mapToDouble(Empleados::getSalario)
                                    .average()
                                    .getAsDouble()
                );
    }
            
    
}
