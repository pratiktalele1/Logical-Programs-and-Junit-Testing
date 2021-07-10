package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForStopWatch;

public class SimulateStopwatch {
	public final static Logger logger=Logger.getLogger("SimulateStopwatch");
	
	public static void main(String[] args) {
		//getting start time
		long startTime=(long) (UtilityForStopWatch.getTime()/1000.0);
		logger.log(Level.INFO,"Program start time - "+startTime/1000.0);
		
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
		//getting end time
		long endTime=(long)(UtilityForStopWatch.getTime()/1000.0);
		logger.log(Level.INFO,"end time is -"+endTime/1000.0);
		
		//program execution time
		logger.log(Level.INFO,"program execution time is - "+(endTime-startTime)/1000.0);
		
	}
}
