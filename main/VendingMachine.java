package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForVendingMachine;

public class VendingMachine {
	public final static Logger logger=Logger.getLogger("VendingMachine");
	public static void main(String[] args) {
		
		logger.log(Level.INFO,"Enter amount :- ");
		//getting input from user
		int getInput=UtilityForVendingMachine.getInput();
		
		//checking for change from machine
		UtilityForVendingMachine.ChangeFromVendingMachine(getInput);
		
		
	}
}
