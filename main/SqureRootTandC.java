package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForSquareRootTandC;

public class SqureRootTandC {

	public final static Logger logger=Logger.getLogger("SqureRootTandC");
	public static void main(String[] args) {
	
		//getting user input
		logger.log(Level.INFO,"Enter the non negative number :- ");
		double c=UtilityForSquareRootTandC.getInput();
		//passing input and finding square root
		if(c>0) {
			logger.log(Level.INFO,"square root of non negative number :- "+UtilityForSquareRootTandC.sqrt(c));
		}else {
			logger.log(Level.INFO,"Wrong negative input");
		}
		
	}
}
