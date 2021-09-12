package org.junit.junit5Tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class J05RepeatedTestDisabledTest {
	
	// @RepeatedTest JUnit5 ile yeni gelmistir

	@RepeatedTest(10)
	@DisplayName("Contain test will is executed 10 times")
	void containsTest() {
		
		assertFalse("abcdefg".contains("hi"));
		System.out.println("containsTest ran");
	}
	
	@BeforeEach
	void beforeEachTest(TestInfo info) {
		System.out.println(info.getDisplayName() + " beforeEach ran");
	}
	
	@AfterEach
	void afterEachTest(TestInfo info) {
		System.out.println(info.getDisplayName() + " afterEach ran");
		System.out.println("=======================");
	}
	
	@RepeatedTest(4)
	@DisplayName("addingTest will be executed 4 times")
	void addingTest() {
		assertEquals(3, Math.addExact(1, 2));
		System.out.println("addingTest ran");
	}
	
	@Disabled("not completed yet..")
	@Test
	void testStringLength() {
		String str = "Unit test with Junit";
		int actual = str.length();
		int expected = 20;
		
		assertEquals(expected, actual, "The two lengths are not equal");
		System.out.println("testStringLength() ran");
	}
	
}
