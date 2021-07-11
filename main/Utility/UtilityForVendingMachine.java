package main.Utility;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtilityForVendingMachine {

	public final static Logger logger=Logger.getLogger("UtilityForVendingMachine");
	//getting user input
	public static int getInput() {
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput; 
	}
	
	//vending machine
	public static void ChangeFromVendingMachine(int getInput) {
		int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] Counter = new int[9];
      
        // counting notes 
        for (int i = 0; i < 9; i++) {
			if (getInput >= notes[i]) {
				Counter[i] = getInput / notes[i];
                getInput = getInput - Counter[i] * notes[i];
            }
        }
      
        // Printing notes
        logger.log(Level.INFO,"following notes :-");
        for (int i = 0; i < 9; i++) {
            if (Counter[i] != 0) {
            	logger.log(Level.INFO,notes[i] + " Rs :- "+ Counter[i]+" note");
            }
        }
	}

}
