package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForPrimeNumber;

public class PrimeNumber {
	public final static Logger logger=Logger.getLogger("PrimeNumber");
	public static int getUserInput; 
	public static int primeOrNot;
	
	public static void main(String[] args) {
		
		//getting user input
		logger.log(Level.INFO,"Enter no-");
		getUserInput=UtilityForPrimeNumber.getInput();
		//displaying input
		logger.log(Level.INFO,"user no is-"+getUserInput);
		
		//checking prime or not
		primeOrNot=UtilityForPrimeNumber.checkPrimeNumber(getUserInput);
		
		if(primeOrNot==1) {
			logger.log(Level.INFO,getUserInput+"- is a prime number");
		}else {
			logger.log(Level.INFO,getUserInput+" -is not a prime number");
		}

	}
}
