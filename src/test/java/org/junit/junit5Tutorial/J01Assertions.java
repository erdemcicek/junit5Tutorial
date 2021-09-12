package org.junit.junit5Tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J01Assertions {
	
	@Test
	@DisplayName("Length method test")
	void testToAssert() {
		int actual = "abcde".length();
		int expected = 4;
		
		// 1. assertEquals()
//		assertEquals(expected, actual, "This is not expected length value");
		
		// 2. assertNotEquals()
//		assertNotEquals(expected, actual);
		
		
		// 3. assertTrue()
		assertTrue(actual==expected, "TRUE: The two values are not equal");
		
		// 4. assertFalse()
		assertFalse(actual==expected, "FALSE: The two values are equal while they have been expected as different");
		
	}
	
	@Test
	void testToConvertUpper() {
		
		String actual = "abcd".toUpperCase();
		String expected = "ABCD";
		
		assertEquals(expected, actual, "EQUAL: Not equal");
		
		assertTrue(actual.equals(expected));
		
		assertNull(actual, "NULL: The result is not null");
		
		
	}
	@Test
	@DisplayName("Contain test method")
	void testToContain() {
		
		boolean actual = "abcd".contains("hi");
		boolean expected = false;
		
		assertEquals(expected, actual, "The string contains 'hi' while it is expected not to");
	}
	
	@Test
	@DisplayName("String array test with split method")
	void testWithArrays() {
		
		String str = "Let's test with Junit5";
		String[] actual = str.split(" ");
		String[] expected = {"Let's", "test", "with", "Junit5"};
		
		assertArrayEquals(expected, actual, "The arrays are not equal");
	}
	
	

}
