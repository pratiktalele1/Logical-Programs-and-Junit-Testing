package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForPerfectNumber;

public class PerfectNumber {
	
	//initilazing variables
	public static int getUserInput;
	
	//initilazing logger
	public static final Logger logger=Logger.getLogger("PerfectNumber");

	public static void main(String[] args) {
		
		logger.log(Level.INFO,"Enter number-");
		//getting user input
		getUserInput=UtilityForPerfectNumber.getInput();
		//displaying user input
		logger.log(Level.INFO,"user input is -"+getUserInput);
		//checking number perfect or not
		UtilityForPerfectNumber.displayPerfectOrNot(getUserInput);
		
		
		
	}
}
