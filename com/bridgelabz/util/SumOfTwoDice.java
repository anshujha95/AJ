 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SumOfTwoDice.java
 *  Execution:    java -cp bin com.bridgelabz.util.SumOfTwoDice n
 *  
 *  Purpose:To find the sum of two dice.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/


package com.Profound.util;
 
 public class SumOfTwoDice {
	
	public static void main(String arg[]){
		//taking random values from user
		double diceOne=(Math.random()*6);
		double diceTwo=(Math.random()*6);
		//sum of dice
		double sumOfDice=diceOne+diceTwo;
		sumOfDice=Math.round(sumOfDice);
		System.out.println("Sum of Two Dice is :"+sumOfDice);
	}
 }
		