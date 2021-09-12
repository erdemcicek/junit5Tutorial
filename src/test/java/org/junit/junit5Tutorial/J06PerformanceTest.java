package org.junit.junit5Tutorial;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.stream.DoubleStream;
// import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class J06PerformanceTest {
	
	@Test
	void performance() {
		
//		assertTimeout(Duration.ofSeconds(1), 
//				() -> IntStream.rangeClosed(1, 1000).forEach( t-> System.out.print((t<10?t+"  ": (t<100 ? t+" " : t)) 
//						+ ( t%10==0 ? "\n" : " " ))));
		
		assertTimeout(Duration.ofMillis(10), ()-> DoubleStream.iterate(1, t->t+1)).limit(1000000).sum();
		
	}
	

}
