package main.Utility;

import java.util.Scanner;

public class UtilityForBinaryShift {
	
	//get user input
	public static int getInput() {
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	//shift number
	public static int shiftBinary(int getInput) {
		return ((getInput & 0x0F) << 4 | (getInput & 0xF0) >> 4);
	}
}
