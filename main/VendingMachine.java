package main;

import java.util.logging.Logger;

import main.Utility.UtilityForVendingMachine;

public class VendingMachine {
	public final static Logger logger=Logger.getLogger("VendingMachine");
	public static void main(String[] args) {
		int[] arrayOfNotes=new int[8];
		
		
		
		//getting input from user
		int getInput=UtilityForVendingMachine.getUserInput();
		
		//checking for change from machine
		UtilityForVendingMachine.change(getInput);
		
		
	}
}
