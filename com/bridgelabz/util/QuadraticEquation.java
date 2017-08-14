/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/QuadraticEquation.java
 *  Execution:    java -cp bin com.bridgelabz.util.QuadraticEquationn
 *  
 *  Purpose:To find whether the roots of quadratic equation is real,equal or imaginary.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.bridgelabz.util;
import java.util.Scanner;


public class QuadraticEquation
{
	public static void main(String args[])
	{
	
	double root1,root2,d;
	Scanner s = new Scanner(System.in);
	System.out.println("given quadratic equation: ax^2+bx+c");
	System.out.println("enter a:");
	int a = s.nextInt();
	System.out.println("enter b:");
	int b = s.nextInt();
	System.out.println("enter c:"); 
	int c = s.nextInt();
	System.out.println("given quadratic equation " +a+ " " +b+ " " +c);
	d = (b * (b-4) * a * c);
	
	if(d > 0)
		{
			System.out.println("roots are real and unequal");
			root1 = (- b + Math.sqrt(d)) / (2 * a);
			root2 = (- b - Math.sqrt(d)) / (2 * a);
			System.out.println("first root  is:" + root1);
			System.out.println("second root is:" + root2);
		} 
		
	else if(d == 0)
		{
			System.out.println("roots are real and equal");
			root1 = ( - b + Math.sqrt(d)) / (2 * a);
			System.out.println("root:" + root1);
		}
		
	else
		{
			System.out.println("roots are imaginary");
		}
	}
}

 
 
