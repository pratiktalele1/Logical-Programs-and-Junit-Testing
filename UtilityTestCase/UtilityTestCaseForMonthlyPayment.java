package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForMonthlyPayment;

class UtilityTestCaseForMonthlyPayment {

	@Test
	void passTest() {
		double check=UtilityForMonthlyPayment.calculatePayment(1236, 15, 30);
		assertEquals(31.267106370146553, check);
	}
	
	@Test
	void failTest() {
		double check=UtilityForMonthlyPayment.calculatePayment(1236, 15, 30);
		assertEquals(31.2671, check);
	}

}
