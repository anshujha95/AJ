/******************************************************************************
*  Compilation:  javac -d bin com/bridgelabz/util/Stats.java
*  Execution:    java -cp bin com.bridgelabz.util.Stats
*  
*  Purpose: To print five random values between 0 and 1 
*           and their average value, and their minimum and maximum value. 
*
*  @author  Anshu Jha
*  @version 1.0
*  @since   015-08-2017
*
******************************************************************************/

package com.bridgelabz.util;

public class Stats{


  static double array[]=new double[5];
  
  static double avg, min, max;

  public static void main( String args[]) 
{
    for(int i=0; i < array.length; i++)
{
  array[i] = Math.random(); 
}
    for(int i=0; i<array.length; i++){
  System.out.println(array[i]); 
} 
//Calculates Avg of 5 Random numbers 
    avg = (array[0]+array[1]+array[2]+array[3]+array[4])/5;
    System.out.println("Avg value is "+avg);
//Calculates Min value from 5 random numbers 
    min = Math.min(array[0],Math.min(array[1],Math.min(array[2],Math.min(array[3],array[4]))));
    System.out.println("Min value is "+min);
//Calculates Max value from 5 random numbers 
    max = Math.max(array[0],Math.max(array[1],Math.max(array[2],Math.max(array[3],array[4]))));
    System.out.println("Max value is "+max);
  }
}
