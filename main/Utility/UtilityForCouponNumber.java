package main.Utility;

import java.util.Scanner;

public class UtilityForCouponNumber {

	//getting user input
	public static int getInput() {
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	//generating random number
	public static int getRandomNumber(int getUserInput) {
		return (int) (Math.random()*getUserInput);
	}
	
	//checking for distinct cards
	public static int checkForCards(int getUserInput) {
		
		boolean[] insertCard = new boolean[getUserInput];  
        int count = 0;                           
        int newNumber  = 0;                       

        
        while (newNumber < getUserInput) {
            int value = getRandomNumber(getUserInput);             
            count++;  
            if (!insertCard[value]) {           
            	newNumber++;
            	insertCard[value] = true;
            }
        }
        
        
        return count;
		
	}
}
