package main;

import main.Utility.UtilityForMonthlyPayment;

public class monthlyPayment {
	public static void main(String[] args) {
		//getting user input gram command line
		double P = Integer. parseInt(args[0]);
		double Y = Integer. parseInt(args[1]);		
		double R = Integer. parseInt(args[2]);
		
		//displaying payment
		System.out.println(UtilityForMonthlyPayment.calculatePayment(P, Y, R));
		
	}
}
