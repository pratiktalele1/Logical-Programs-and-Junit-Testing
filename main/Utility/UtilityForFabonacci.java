package main.Utility;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtilityForFabonacci {
	
	private final static Logger logger = Logger.getLogger("Main");
	public static int getInput() {
		logger.log(Level.INFO,"Enter nth number- ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		System.out.println("end no is-" + getUserInput);
		logger.log(Level.INFO,"end no is - "+getUserInput);
		return getUserInput;
	}
	
	public static void printFabonic(int getUserInput,int firstNumber,int secondNumber,int nextNumber) {
		for(int i=2;i<getUserInput;++i)    
		 {    
		  nextNumber=firstNumber+secondNumber;    
		  System.out.print(" "+nextNumber);    
		  firstNumber=secondNumber;    
		  secondNumber=nextNumber;    
		 }  
	}
}
