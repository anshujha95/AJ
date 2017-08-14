/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distance n
 *  
 *  Purpose:To find out the distance between the coordinates.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.Profound.util;



public class PrimeNumber
{
	public static void main(String args[])
	{
		int flag=0;
		//defining ranges for the Prime no
		int minRange=Integer.parseInt(args[0]);
		int maxRange=Integer.parseInt(args[1]);
		System.out.println("Following are the Prime numbers between"+minRange+"and"+maxRange);
		for( int i=minRange;i<=maxRange;i++)
		{
			flag=0;
			//Determining wheather it is prime no or not
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
			flag=1;
			}
			}
			if(flag!=1)
			{
			//printing the prime no
			System.out.println(i);
			}
		}
	}
}
