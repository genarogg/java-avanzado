/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamsParalelos;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

/**
 *
 * @author Genarogg
 */
public class TestStreams {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        
        //crear array aleatorio de valores tipo long
        long[] values = random.longs(10_000_000, 1, 1001).toArray();
        
        //Realizar calculos por separado
        Instant separateStart = Instant.now();
        long count = Arrays.stream(values).count();
        long sum = Arrays.stream(values).sum();
        long min = Arrays.stream(values).min().getAsLong();
        long max = Arrays.stream(values).max().getAsLong();
        double average = Arrays.stream(values).average().getAsDouble();
        Instant separateEnd = Instant.now();
        
        //Desplegar resultados
        System.out.println("Resultados de tiempo de cálculos por separado");
        System.out.printf("  count: %,d%n", count);
        System.out.printf("    sum: %,d%n", sum);
        System.out.printf("    min: %,d%n", min);
        System.out.printf("    max: %,d%n", max);
        System.out.printf("average: %,f%n", average);
        System.out.printf("Total de tiempo en milisegundos "
                + "que se llevó el cáldulo por separado: %,d%n", 
                Duration.between(separateStart, separateEnd).toMillis());
        
        //Tiempo de la operación sum realizada con un stream secuencial.
        LongStream stream1 = Arrays.stream(values);
        System.out.println("Calculando estadísticas sobre un stream secuencial");
        Instant sequentialStart = Instant.now();
        LongSummaryStatistics results1 = stream1.summaryStatistics();
        Instant sequentialEnd = Instant.now();
        
        //desplegar resultados
        desplegarEstadisticas(results1);
        System.out.printf("Total de tiempo en milisegundos"
                + " que se llevó el stream secuencial: %d%n%n", 
                Duration.between(sequentialStart, sequentialEnd).toMillis());
        
        //tiempo de suma con stream paralelo
        LongStream stream2 = Arrays.stream(values).parallel();
        System.out.println("Calculando estadísticas sobre stream paralelo");
        Instant parallelStart = Instant.now();
        LongSummaryStatistics results2 = stream2.summaryStatistics();
        Instant parallelEnd = Instant.now();
        
       
    }

    
}
