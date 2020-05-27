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
        
       
    }

    
}
