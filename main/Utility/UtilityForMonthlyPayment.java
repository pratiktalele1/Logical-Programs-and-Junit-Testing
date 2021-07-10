package main.Utility;

public class UtilityForMonthlyPayment {

	//getting user input
	public static double calculatePayment(double P,double Y,double R) {
		 double n=(12*Y);
		 double r=(R/(12*100));
		double payment=(P*r)/(1-(Math.pow((1+r), (-n))));
		return payment;
	}
}
