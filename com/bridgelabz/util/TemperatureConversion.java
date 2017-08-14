/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion n
 *  
 *  Purpose:To find out the conversion from farenheit to celcius and celcius to farenheit.
 *
 *  @author  AnshuJha
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;


 /*
 *import statements
 */
import java.util.*;

public class TemperatureConversion
{
	public static void main(String args[])
	{
	double mTemperatureConverted;
	
/*
* accept temperature in farenheit from user
*/
	System.out.println("enter temperature in farenheit");
	double mTemperatureFarenheit = Double.parseDouble(args[0]);
	
/*
* formula for temperature conversion from farenheit to celcius
*/ 
	mTemperatureConverted = ((mTemperatureFarenheit - 32) / 1.8);
	System.out.println("temperature in celcius is " + mTemperatureConverted);
	}
}
