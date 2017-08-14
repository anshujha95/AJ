/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrimeFactor.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeFactor n
 *  
 *  Purpose:To print the prime factors.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/

 

 /*
 *import statements
 */
package com.bridgelabz.util;

public class PrimeFactor
{
	public static void main(String args[])
	{
		int N=Integer.parseInt(args[0]);
		System.out.println("following are the factors of "+N);
		for(int i=1;i*i<=N;i++)
		{
			if(N%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
