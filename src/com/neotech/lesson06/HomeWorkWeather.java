package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWorkWeather {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask user to input city and temperature.
          Your program should convert Fahrenheit into celsius and 
          print "The temperature is the city __ is __"
          
          Celcius = (°F − 32) x 5/9 
          Fahrenheit = (Celsius * 1.8) + 32
		 */
		
        
          
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Where do you live? ");
		String city = scan.nextLine();
		
		System.out.println("Please enter current temperture");
       
		long temp = scan.nextLong();
		
	
		long convert = ((temp - 32) * 5/9);
		
		
		
	System.out.println("The temperture in the of  " + city + " is " + convert);
       
		
		
		
		
		
		
		
		
		
		
	

	}

}
