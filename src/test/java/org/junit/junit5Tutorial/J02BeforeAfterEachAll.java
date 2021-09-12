package org.junit.junit5Tutorial;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

/*
 	======================  @BeforeEach  -  @AfterEach  =========================
 	
 	1 -) @BeforeEach anotasyonu kullanilan bir metot, her test metodu calismadan once calistirilir.
 		Bu ozelligi sayesinde test verilerinin ayarlanmasi (baslatilmasi) icin kullanilabilir.
 	
 	2 -) @AfterEach anotasyonu kullanilan bir metot, her test metodu bittikten sonra calistirilir.
 		Bu ozelligi sayesinde test verilerinin temizlenmesi icin kullanilabilir.
 	
 	3 -) Junit4 de bu anotasyonu yerine @Before ve @After kullaniliyordu.
 	
 	======================  @BeforeAll  -  @AfterAll  =========================
 	
 	1 -) @BeforeAll tum test metotlarindan once calisan bir metot olusturmak icin kullanilir.
 		Dolayisiyla veritabani iceren bir test isleminde ilk olarak veritabanina baglanmak gerekeceginden @BeforeAll
 		anotasyonu ile bir metot tanimlanarak ilk olarak veritabani baglanma proseduru isletilebilir.
 		
 	2 -) @AfterAll ile tum test metotlari bittikten sonra calisan bir metot olusturulabilir. 
 		Bu ozelligi sayesinde testler bittikten sonra veritabani oturumu kapatilabilir.
 		
 		Not 1: @BeforeAll ve @AfterAll anotasyonlarinin kullanildigi metotlar static olmalidir.
 		Not 2: Junit4 de @BeforeClass ve @AfterClass metotlari kullanilmaktaydi.
 	
 	
 */



public class J02BeforeAfterEachAll {
	
	@BeforeAll
	static void connnectToDatabase() {
		System.out.println("Connected to the database...");
	}
	
	@AfterAll
	static void endDatabaseConnection() {
		System.out.println("Connection is cut out");
	}
	
	String str = "";
	
	@BeforeEach
	void setUp(TestInfo info) {
		
		str = "Unit test with Junit5";
		System.out.println(info.getDisplayName() + " test data has been started"); // 1
	}
	
	@AfterEach
	void clean(TestInfo info) {
		
		str = "";
		System.out.println(info.getDisplayName() + " test data has been reset");  // 3
	}
	
	@Test
	@DisplayName("Length test method")
	void testStringLength() {
		
		String str = "Unit test with Junit5";
		int actual = str.length();
		int expected = 21;
		
		assertEquals(expected, actual, "Not equal");
		System.out.println("Length method is used"); // 2
		
	}
	
	@Test
	@DisplayName("String array test with split method")  // started 4  reset 6
	void testWithArrays() {
		
		String str = "Let's test with Junit5";
		String[] actual = str.split(" ");
		String[] expected = {"Let's", "test", "with", "Junit5"};
		
		assertArrayEquals(expected, actual, "The arrays are not equal");
		System.out.println("Array method is used"); // 5
	}
	
}
