/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek n
 *  
 *  Purpose:To find the day of the week.
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.bridgelabz.util;

 /*
 *import statements
 */
 import java.util.*;

public class DayOfWeek
{
	public static void main(String args[])
	{
		int x , y1 , m1 , d1;
		
/*
* three command line arguments bring accepted from user: month, day, and year
*/		
		int mMonth = Integer.parseInt(args[0]);
		int mDay   = Integer.parseInt(args[1]);
		int mYear  = Integer.parseInt(args[2]);
		
		
/* 
* calculations of year, leap year, month, and day ,respectively
*/
		y1 = mYear - (14-mMonth) / 12;
		x  = y1 + y1 / 4-y1 / 100+y1 / 400;
		m1 = mMonth + 12 * ((14-mMonth)/12) -2;
		d1 =(mDay+x+(31*m1) / 12) % 7;
		
		//System.out.println("day of the week is " +d1);
		switch(d1)
		{
			case 0:
			System.out.println("Day of the week is Sunday " );
			break;
			
			case 1:
			System.out.println("Day of the week is Monday " );
			break;
			
			case 2:
			System.out.println("Day of the week is Tuesday " );
			break;
			
			case 3:
			System.out.println("Day of the week is Wednesday" );
			break;
			
			case 4:
			System.out.println("Day of the week is Thursday " );
			break;
			
			case 5:
			System.out.println("Day of the week is Friday " );
			break;
			
			case 6:
			System.out.println("Day of the week is Saturday " );
			break;
		}

			      
	}
}	
		
		
