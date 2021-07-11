package main.Utility;

import java.util.Scanner;

public class UtilityForSquareRootTandC {

	//getting user input
	public static int getInput() {
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	//finding square root of given number
	public static double sqrt(Double c) {
		double epsilon = 1e-15;
		double t = c;
		while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
		
		return t;
	}
}
