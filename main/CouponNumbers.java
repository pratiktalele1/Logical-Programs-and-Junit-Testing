package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForCouponNumber;


public class CouponNumbers {
	public static Logger logger=Logger.getLogger("CouponNumber");
	public static int getUserInput;
	public static int getRandomNumber;
	
	public static void main(String[] args) {
		//getting user input
		logger.log(Level.INFO,"Enter no - ");
		getUserInput=UtilityForCouponNumber.getInput();
		
		//checking for distinct cards
		getRandomNumber=UtilityForCouponNumber.checkForCards(getUserInput);
		logger.log(Level.INFO,"coupon no - "+getRandomNumber);
		
		
	}	
}
