 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DoubleOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.DoubleOptn
 *  
 *  Purpose:To perform the Double operation when integer input is given by user.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.bridgelabz.util;


public class DoubleOpt{
	public static void main(String[]args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double Result;
		Result = a+(b*c);
		System.out.println("Result for Integer operation " +a+ " + " +b+ " * " +c+ " is " +Result);
		
		Result = (a*b)+c;
		System.out.println("Result for Integer operation " +a+ " * " +b+ " + " +c+ " is " +Result);
		
		Result = c+(a/b);
		System.out.println("Result for Integer operation " +c+ " + " +a+ " / " +b+ " is " +Result);
		
		Result = (a%b)+c;
		System.out.println("Result for Integer operation " +a+ " % " +b+ " + " +c+ " is " +Result);
	}
}
		
