/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SpringSeason.java
 *  Execution:    java -cp bin com.bridgelabz.util.SpringSeason n
 *  
 *  Purpose:To find the Spring season.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;

public class SpringSeason{

/*
 * The main function is written to print integer operations 
 */

	public static void main(String[]args){
		
/*
 * Date and Month are accepted using CommandLine argument
 */		
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		
		//True if any one of them is true
		//False when each and every condition is false
		Boolean isspring = (d >= 20 && d<=31 && m==3)||(d>=1 && d<=30 && m==4)
						   ||(d>=1 && d<=31 && m==5)||(d>=1 && d<=20 && m==6);
						   
	    System.out.println("Spring Season");
		
	}
}
	 
