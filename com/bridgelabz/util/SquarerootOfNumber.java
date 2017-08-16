/***************************************************************************************
*  Compilation:  javac -d bin com/bridgelabz/util/SquarerootOfNumber.java
*  Execution:    java -cp bin com.bridgelabz.util.SquarerootOfNumber
*  
*  Purpose:  To find the square root of a non negative number using Newton's Method
*
*  @author  Anshu Jha
*  @version 1.0
*  @since   16-08-2017
*
**************************************************************************************/

package com.bridgelabz.util;

public class SquarerootOfNumber
{ 
  
  /*
   * c stores number entered by user
   * epsilon stores value to remove relative error tolerance
   * t stores estimate value of the square root of c
   */
  static double epsilon = 1e-15, t, c; 
  
  public static void main(String[] args) 
{ 
    c = Double.parseDouble(args[0]); 
    t = c;
    // loop continues till the condition is satisfied
    while (Math.abs(t - c/t) > epsilon*t) 
{
      t = (c/t + t) / 2.0;
    }
    System.out.println(t);
  }
}