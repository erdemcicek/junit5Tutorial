package org.junit.junit5Tutorial;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/*
 	assertThrow() metodu belirtilen islemin (executable) belirtilen turde bir Exception olusturup olusturmadigini 
 	test eder. Dolayisiyla 2 parametre alir.
 		1. parametre Exception turu,
 		2. parametre ise calistirilacak olan islemdir.
 	Eger islem belirtilen turde bir exception olusturursa test basarili olur.
 	Ama exception olusmaz ise veya turu yanlis olursa test basarisiz olur.
 	Exception turunde parent-child iliskisi var ise yine test basarili sayilir.
 	
 */

public class J03TestingExceptions {

	@Test
	void testException() {
		
		String str = null;
		assertThrows(NullPointerException.class, () -> str.length());
		// str null oldugu icin NullPointerException olusur. Bu exception'i assertThrows() yakalar
		// ve turune bakar. Eger turu parametredeki exception turu ile ayni ise Test'i basarili sayar.
		
	}
	
	@Test
	void testException2() {
		
		assertThrows( NumberFormatException.class, ()-> Integer.parseInt("123abc")); 
		
		
	}
	
	@Test
	void testException3() {
		
		assertThrows( IllegalArgumentException.class, () -> printAge(-3) );
	}
	
	private void printAge(int age) {
		if( age < 0) throw new IllegalArgumentException();
		else System.out.println(age);
	}
	
	@Test
	void testException4() {
		
		assertThrows(ArithmeticException.class, () -> divide(5, 0));
	}
	
	private int divide(int a, int b) {
		return a/b;
	}
	
	
	
	
	
	
	
	
	
	
	
}




















