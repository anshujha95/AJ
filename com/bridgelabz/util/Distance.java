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



	public class Distance
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);//taking coordinates
		double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));//calculating using formulae
		System.out.println("Distance from ("+x+","+y+")to (0,0) is ="+dist);
	}
}