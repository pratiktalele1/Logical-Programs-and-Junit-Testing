package main.Utility;

import java.util.Scanner;

public class UtilityForVendingMachine {
	
	public static int[] arrayOfNotes=new int[8];
	
	
	public static int getUserInput() {
	
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		
		return getUserInput; 
	}
	
	public static void change(int getInput) {
		if(getInput<1000)
	}
}
