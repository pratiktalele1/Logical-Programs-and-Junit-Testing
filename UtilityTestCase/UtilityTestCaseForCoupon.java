package UtilityTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Utility.UtilityForCouponNumber;

class UtilityTestCaseForCoupon {

	@Test
	void passtest() {
		int check=UtilityForCouponNumber.checkForCards(6);
		assertEquals(10, check);
	}
	
	@Test
	void failtest() {
		int check=UtilityForCouponNumber.checkForCards(10);
		assertEquals(10, check);
	}

}
