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
        
        
    }

    
}
