/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.util.PowerOf2 n
 *  
 *  Purpose:To find the power of 2.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;


public class PowerOf2{
		
	public static void main(String[]args){
		//taking power for 2 from user
		int n = Integer.parseInt(args[0]);
		int powerof2=1;
		//print no with power
		for(int i=0;i<=n;i++){
			System.out.println(+i+ " "+powerof2);
			powerof2 = 2 * powerof2;
		}
	}
}
	