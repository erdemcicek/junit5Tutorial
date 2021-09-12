package org.junit;

import java.util.stream.DoubleStream;

public class C01Calculator {

	static double add(double... numbers) {
		
		return DoubleStream.of(numbers).sum();
	}
	
	static double multiply(double... numbers) {
		
		return DoubleStream.of(numbers).reduce(1, (x, y) -> x *y);
	}
}
