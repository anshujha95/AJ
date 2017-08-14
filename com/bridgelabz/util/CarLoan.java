
/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/CarLoan.java
 *  Execution:    java -cp bin com.bridgelabz.util.CarLoan n
 *  
 *  Purpose: Determines the compound interest of the carloan.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/



package com.bridgelabz.util;
import java.util.*;

public class CarLoan
{
	public static void main(String args[])
	{
		
/*
* Three command line arguments are taken as input P , Y , R.
*/
		float P = Float.parseFloat(args[0]);
		float Y = Float.parseFloat(args[1]);
		float R = Float.parseFloat(args[2]);

        float n = 12 * Y;
		float r = R / (12*100);
		double x = Math.pow(1+r,(-n));
		
/*
* formula for calculating payment
*/
		double payment = (P*r) / (1-x);
		System.out.println("CarLoan is: " + payment);
	}
}
