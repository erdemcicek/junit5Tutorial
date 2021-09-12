package org.junit.junit5Tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class J04ParameterizedTest {

	// Length() metodunun asagidaki kosullar icin 0'dan buyuk deger dondurup dondurmedigini test ediniz.
	// Kosullar: ABCD, ABC, A, ABCDE
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD", "ABC", "A", "ABCDEF"})
	void isLengthGreaterZeroParam(String str) {
		
		assertTrue( str.length() > 0 ); // All passed	
//		assertTrue( str.length() > 1 ); // Third one failed
		
	}
	
	@ParameterizedTest(name = " Expected: {0}, Actual: {1}")
	@CsvSource( value = {"ABCD, abcd", "ABC, aBc", "A, a"})
	void testOfConvertingUppercase(String expectedUpp, String str) {
		
		assertEquals( expectedUpp, str.toUpperCase());
	}
	
	// Bir CSV dosyasindaki verileri okuyarak test islemini gerceklestirilebilir
	// Bunun icin @CsvFileSource anotasyonu kullanilir
	// Veri dosyasi src/test/resources klasoru altina konulur ise dogrudan erisim saglanabilir
	// numLinesToSkip = 1 ile baslangic satirindan itibaren dikkate alinmayarak satir sayisi belirtilir
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void uppercaseFromCsvFile(String word, String upper) {
		
		assertEquals(upper, word.toUpperCase());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
