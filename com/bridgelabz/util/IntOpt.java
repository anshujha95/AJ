 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/IntOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.IntOpt n
 *  
 *  Purpose:To perform the operation when integer input is given by user.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.bridgelabz.util;

public class IntOpt{
	
/*
 * The main function is written to print integer operations 
 */
	public static void main(String[]args){
/*		
 * Values are accepted using CommandLine argument
 */
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

/* 
 * Here result store the final value of interger operations as integer using precedence of the operators 
 */ 
		int Result;
		Result = a+(b*c);
		System.out.println("Result for Integer operation" +a+ "+" +b+ "*" +c+ "is" +Result);
		
		Result = (a*b)+c;
		System.out.println("Result for Integer operation" +a+ "*" +b+ "+" +c+ "is" +Result);
		
		Result = c+(a/b);
		System.out.println("Result for Integer operation" +c+ "+" +a+ "/" +b+ "is" +Result);
		
		Result = (a%b)+c;
		System.out.println("Result for Integer operation" +a+ "%" +b+ "+" +c+ "is" +Result);
	}
}
		
