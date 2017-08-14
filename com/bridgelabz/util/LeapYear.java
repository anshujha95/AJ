 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear n
 *  
 *  Purpose:To find the leap year.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.Profound.util;


public class LeapYear {
	
	public static void main(String arg[]) {
		int year=Integer.parseInt(arg[0]);
		boolean isLeapYear=(year%4==0);
		isLeapYear=isLeapYear && (year%100!=0);
		isLeapYear=isLeapYear || (year%400==0);
		if(isLeapYear==true)
		{
			System.out.println(year+" is Leap Year");
		}
		else
		{
			System.out.println(year+" not is Leap Year");
		
		}
	}
}
						