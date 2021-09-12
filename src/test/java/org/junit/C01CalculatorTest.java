package org.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class C01CalculatorTest {

	@Test
	@DisplayName("Adds two numbers")
	void add() {
		assertEquals(4.5, C01Calculator.add(2.2, 2.3));
		assertEquals(2, C01Calculator.add(1.1, 0.9));
		assertEquals(-5, C01Calculator.add(-2, -3));

	}
	
	@Test
	@DisplayName("Multiplies two numbers")
	void multiply() {
		assertAll(
					() -> assertEquals(-4, C01Calculator.multiply(-2, 2)),
					() -> assertEquals(-6, C01Calculator.multiply(-2, 3)),
					() -> assertEquals(-8, C01Calculator.multiply(-2, 4))
				);

	}
}
