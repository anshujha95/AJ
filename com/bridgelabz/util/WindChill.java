 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill n
 *  
 *  Purpose:To find the value of windchill.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/

package com.Profound.util;

public class WindChill{
	public static void main(String args[]){
		double temperature=Double.parseDouble(args[0]);
		double windSpeed=Double.parseDouble(args[1]);
		double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
		System.out.println("Wind Chill is: "+windChill);
		
 	}
}