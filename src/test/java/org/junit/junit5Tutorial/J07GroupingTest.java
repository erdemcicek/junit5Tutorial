package org.junit.junit5Tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// 1-) 0 icermeyen int sayilar icin multiplyExact() metodunu test ediniz.
// 2-) 0 iceren int sayilar icin multiplyExact() metodunu test ediniz

public class J07GroupingTest {

	@ParameterizedTest
	@CsvSource(value = {"12, 4, 3", "-12, -6, 2", "12, -4, -3", "-12, 4, -3"})
	void multiply(int result, int x, int y) {
		
		assertEquals(result, Math.multiplyExact(x, y));
		
	}
	
	@Nested
	class testsIncludingZero{
		
		@ParameterizedTest
		@CsvSource(value = {"0, 0, 4", "0, 4, 0", "0, -4, 0", "0, 0, -4", "0, 0, 0"})
		void multiply(int result, int x, int y) {
			assertEquals(result, Math.multiplyExact(x, y));
		}
		
		@ParameterizedTest
		@CsvSource(value = {"4, 0, 4", "4, 4, 0", "-4, -4, 0", "-4, 0, -4", "0, 0, 0"})
		void add(int result, int x, int y) {
			assertEquals(result, Math.addExact(x, y));
		}
		
		@ParameterizedTest
		@CsvSource(value = {"0, 0, 4", "0, 4, 0", "0, -4, 0", "0, 0, -4", "0, 0, 0"})
		void divide(int result, int x, int y) {
			
			if( y == 0 ) 
				assertThrows(ArithmeticException.class, () -> myDivideMethod(x, y));
			else 
				assertEquals(result, myDivideMethod(x, y));
			
		}
		
		private int myDivideMethod(int a, int b) {
			return a/b;
		}
		
		
	}
}
