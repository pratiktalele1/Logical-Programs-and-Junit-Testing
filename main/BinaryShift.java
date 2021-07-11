package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForBinaryShift;
import main.Utility.UtilityForToBinary;

public class BinaryShift {
	public static void main(String[] args) {
		final Logger logger=Logger.getLogger("binary conversion");
		//get number from user and convert the number
		logger.log(Level.INFO,"Enter number :-");
		logger.log(Level.INFO,"Shift number :-"+UtilityForBinaryShift.shiftBinary(UtilityForBinaryShift.getInput()));
	}
}
