/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SecondLargeSmall.java
 *  Execution:    java -cp bin com.bridgelabz.util.SecondLargeSmall n
 *  
 *  Purpose:To find the second largest and second smallest element from an array without sorting.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.Profound.util;

import java.util.Scanner;

public class SecondLargeSmall
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("Enter the no of elements");
		int noOfElements=sc.nextInt();
		System.out.println("Enter the elements of array");
		for(int i=0;i<noOfElements;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;)
		
	