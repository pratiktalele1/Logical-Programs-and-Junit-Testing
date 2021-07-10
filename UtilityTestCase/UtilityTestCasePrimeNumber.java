package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForPrimeNumber;

class UtilityTestCasePrimeNumber {

	@Test
	void passTest() {
		int check=UtilityForPrimeNumber.checkPrimeNumber(7);
		assertEquals(1, check);
	}
	
	@Test
	void failTest() {
		int check=UtilityForPrimeNumber.checkPrimeNumber(14);
		assertEquals(1, check);
	}

}
