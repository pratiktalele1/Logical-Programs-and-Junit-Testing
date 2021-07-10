package main.Utility;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtilityForPerfectNumber {

	public static final Logger logger=Logger.getLogger("UtilityForPerfectNumber");
	public static int getInput() {
		
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	public static int displayPerfectOrNot(int checkNumber) {
			int add=0;
			//getting user input
				for(int i=1;i<checkNumber;i++) {
					//checking divisible or not
					if(checkNumber%i==0) 
					{
						//displaying perfect divisor
						logger.log(Level.INFO,"divisor number are -"+i);
						//adding every divisor
						add=add+i;
					}
				}
				
				//checking perfect number or not
				if(add==checkNumber) {
					logger.log(Level.INFO,checkNumber+"-is a perfect number ");
				}else {
					logger.log(Level.INFO,checkNumber+"-is not a perfect number ");
				}
				return add;
		
	}
}
