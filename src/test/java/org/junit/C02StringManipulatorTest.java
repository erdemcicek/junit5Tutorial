package org.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class C02StringManipulatorTest {
	
	C02StringManipulator manipulator;
	
	@BeforeEach
	void setUp() {
		manipulator = new C02StringManipulator();
		System.out.println("Test data has been created...");
	}
	
	@AfterEach
	void tearDown() {
		manipulator = null;
		System.out.println("Test data has been deleted...");
	}
	
	@ParameterizedTest
	@CsvSource(value = {"BC, AABC", "BC, ABC", "BCDE, BCDE", "'', AA", "'', A", "B, B", "B, AB"})
	void deleteFirstTwoA(String expected, String input) {
		assertEquals(expected, manipulator.deleteFirstTwoA(input));
		System.out.println("Delete method has been executed");
	}

}
