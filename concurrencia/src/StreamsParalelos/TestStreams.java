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
        
    
    }

    
}
