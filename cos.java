/******************************************************************************
*  Compilation:  javac -d bin com/bridgelabz/util/Cos.java
*  Execution:    java -cp bin com.bridgelabz.util.Cos
*  
*  Purpose: To compute cos x using the Taylor series expansions.
*
*  @author  Anshu Jha
*  @version 1.0
*  @since   15-08-2017
*
******************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class Cos{

  /*
   * x stores the value of x used in Taylor series taken from user 
   * cosx stores the final value of the Taylor series expansions
   * fact1 stores the returned value of the functions
   * power stores the calculated value of Math.pow
   */
  static double x, cosx=1, fact1, temp, power;

  /*
   * term stores the count of no. of terms for Taylor series expansion
   */ 
  static int term;

  /* Find factorial value of an int value
   *
   * @param n to find the factorial value
   * @return factorial value of n
   */ 
  public static int factorial(int n){
int fact=1;
for(int i=1;i<=n;i++){
fact = fact*i;
}
return fact;
  }

  public static void main(String[] args){
Scanner s = new Scanner(System.in);
x = Double.parseDouble(args[0]);
x = x%(2*Math.PI);
System.out.println("Enter the no. of terms:");
term = s.nextInt();
term--;

int j=0;
while(j<=term){
for(int i=2;term!=0;i=i+2){
  fact1 = factorial(i);
  power = Math.pow(x,i);
  temp = power/fact1;
   if (i % 4 == 0) cosx += temp;
   if (i % 4 == 2) cosx -= temp;
  term--;
}
j++;
}
System.out.println(" value of cosx is " +(float)cosx);
  }
}
