package main.Utility;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtilityForPrimeNumber {
	
	//getting user input
	public static int getInput() {
		
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	//checking for prime number
	public static int checkPrimeNumber(int checkPrime) {
		int flag=0;
		for(int i=2;i<=checkPrime;i++) {
			if(checkPrime%i==0) {
				flag++;
			}
		}
		return flag;
	}
}
