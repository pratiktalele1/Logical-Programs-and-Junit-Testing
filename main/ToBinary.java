package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.Utility.UtilityForToBinary;

public class ToBinary {
	public final static Logger logger=Logger.getLogger("ToBinary");
	public static void main(String[] args) {
		int[] getArrayElement=new int[100];
		int check=0;
		UtilityForToBinary obj=new UtilityForToBinary();
		//getting user input
		logger.log(Level.INFO,"Enter no :-");
		getArrayElement=obj.block(obj.getInput());
		
		//print numbers for given number
		logger.log(Level.INFO,"numbers are :-");
		for(int i=0;i<getArrayElement.length;i++)
		{
			if(getArrayElement[i]==0&&check==0) {
				System.out.println((int)Math.pow(2,getArrayElement[i]));
				
				check=1;
			}else if(getArrayElement[i]!=0) {
				System.out.println((int)Math.pow(2,getArrayElement[i]));
			}
			
		}
	}
}
