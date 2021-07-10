package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForTemperaturConversion;

public class temperaturConversionCF {
	public final static Logger logger=Logger.getLogger("temperaturConversionCF");
	public static void main(String[] args) {
		
		//getting input from user
		logger.log(Level.INFO,"Enter degree to convert - ");
		double getInput=UtilityForTemperaturConversion.getInput();
		//select option from user
		logger.log(Level.INFO," 1-For convert c to f");
		logger.log(Level.INFO," 2-For convert f to c");
		double option=UtilityForTemperaturConversion.getInput();
		
		//convert input
	 	double result=UtilityForTemperaturConversion.convert(option,getInput);
		//display output
	 	logger.log(Level.INFO,"convert value is - "+result);
	}
}
