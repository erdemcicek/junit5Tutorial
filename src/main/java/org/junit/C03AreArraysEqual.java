package org.junit;

import java.util.Arrays;

public class C03AreArraysEqual {
	

	public boolean areEquals(Object[] a, Object[] b) {
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
	}
	

}
