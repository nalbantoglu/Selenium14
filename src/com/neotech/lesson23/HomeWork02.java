package com.neotech.lesson23;

public class HomeWork02 {
	
//	
//
//Homework 2:
//    Create a class with 3 overloaded static methods.
//    Then call each overloaded methods with specific arguments and observe the results.

	
	
	static void info()
	{
		System.out.println("Today is tuesday");
	}
	
	
	static void info(String day)
	{
		System.out.println("Today is " + day);
	}
	
	static void info(String day, String month)
	{
		System.out.println("Today is " + day + " month is " + month);
	}
	
	static void info(String[] strArray)
	{
		System.out.println("Today is " + strArray [0] + " and month is " + strArray[1]);
	}
	
	
	public static void main(String[] args) {
		
		
		info();
		
		info("Tuesday");
		
		info ("Tuesday" , "June");
		
		String [] strArr = {"Tuesday" , "June"};
		
		
		info(strArr);
		
		
		
		
		
		
	}

}
