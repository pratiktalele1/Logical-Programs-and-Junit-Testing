package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForTemperaturConversion;

class UtilityTestCaseForTempConversion {

	@Test
	void passTest() {
		double result=UtilityForTemperaturConversion.convert(1.0, 23.36);
		assertEquals(55.36, result);
	}
	
	@Test
	void failTest() {
		double result=UtilityForTemperaturConversion.convert(1.0, 23.36);
		assertEquals(5.36, result);
	}

	

}
