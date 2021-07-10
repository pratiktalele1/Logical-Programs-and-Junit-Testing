package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForPerfectNumber;

class UtilityTestCasePerfectNumber {

	@Test
	void PassTest() {
		int check=UtilityForPerfectNumber.displayPerfectOrNot(28);
		assertEquals(28, check);
	}
	
	@Test
	void FailTest() {
		int check=UtilityForPerfectNumber.displayPerfectOrNot(28);
		assertEquals(14, check);
	}


}
