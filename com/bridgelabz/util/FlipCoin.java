/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin n
 *  
 *  Purpose:To find whether its head or tail.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;

 
 import java.util.Scanner;
 
 public class FlipCoin {
	
	public static void main(String arg[]){
		float noOfTimes=0;
		float headCtr=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 0 to flip the coin");
		int flip=sc.nextInt();
		while(flip==0)
		{
			if(Math.random()<0.5)
			{
			headCtr++;
			System.out.println("Heads");
			}
			else
			{
			System.out.println("Tails");
			}
			noOfTimes++;
			System.out.println("If you want to flip coin again then press 0 ");
			flip=sc.nextInt();
		}
		float percentOfHeads=(headCtr/noOfTimes)*100;
		System.out.println("Percentage of Heads :"+percentOfHeads);
		float percentOfTails=100-percentOfHeads;
		System.out.println("Percentage of Tails :"+percentOfTails);
	}
 }