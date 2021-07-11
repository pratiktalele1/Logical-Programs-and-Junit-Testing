package main.Utility;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtilityForToBinary {
	
	public final static Logger logger=Logger.getLogger("UtilityForToBinary");
    static int getUserInput;
    
    //getting user input
	public static int getInput() {
		Scanner scanInput = new Scanner(System.in);
		getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	//finding blocks
	public static int[] block(long x)
	{
	    ArrayList<Integer> v = new ArrayList<Integer>();
	    int[] array=new int[100];
	    int index=0;
	    while (x > 0)
	    {
	        v.add((int)x % 2);
	        x = x / 2;
	    }
	 
	    logger.log(Level.INFO,"memory blocks are -");

	    for (int i = 0; i < v.size(); i++)
	    {
	        if (v.get(i) == 1)
	        {
	        	logger.log(Level.INFO,i+" , ");
	        	array[index]=i;
	        	index++;
	    }
	}   
	 return array;
	}
	
	
}
