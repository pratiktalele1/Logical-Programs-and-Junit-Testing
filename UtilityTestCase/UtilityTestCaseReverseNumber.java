package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForReverseNumber;

class UtilityTestCaseReverseNumber {

	@Test
	void passTest() {
		int check=UtilityForReverseNumber.reverseNumber(123);
		assertEquals(321, check);
	}
	
	@Test
	void failTest() {
		int check=UtilityForReverseNumber.reverseNumber(123);
		assertEquals(123, check);
	}

}
