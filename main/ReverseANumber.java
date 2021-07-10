package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForReverseNumber;

public class ReverseANumber {
	
	public static final Logger logger=Logger.getLogger("ReverseANumber");
	
	public static int getUserInput;
	public static int getReverseNumber;
	public static void main(String[] args) {
	
	//getting user input	
	logger.log(Level.INFO,"enter number -");
	getUserInput=UtilityForReverseNumber.getInput();	
	
	//reversing number
	getReverseNumber=UtilityForReverseNumber.reverseNumber(getUserInput);
	logger.log(Level.INFO,"Reverse number -"+getReverseNumber);
	
	
		
	}
}
