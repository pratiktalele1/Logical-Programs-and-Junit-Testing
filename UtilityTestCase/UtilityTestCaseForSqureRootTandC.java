package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForSquareRootTandC;

class UtilityTestCaseForSqureRootTandC {

	@Test
	void passTest() {
		//UtilityForSquareRootTandC.sqrt pass case
		double check=UtilityForSquareRootTandC.sqrt(2.0);
		assertEquals(1.414213562373095, check);
	}
	
	@Test
	void failTest() {
		//UtilityForSquareRootTandC.sqrt fail case
		double check=UtilityForSquareRootTandC.sqrt(2.0);
		assertEquals(2.414213562373095, check);
	}

}
