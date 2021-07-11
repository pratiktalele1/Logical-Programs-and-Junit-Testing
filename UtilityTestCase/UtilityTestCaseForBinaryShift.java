package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForBinaryShift;

class UtilityTestCaseForBinaryShift {

	@Test
	void passTest() {
		int check=UtilityForBinaryShift.shiftBinary(100);
		assertEquals(70, check);
	}
	
	@Test
	void failTest() {
		int check=UtilityForBinaryShift.shiftBinary(100);
		assertEquals(80, check);
	}

}
