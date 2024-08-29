package com.neotech.lesson15;

public class CalculatorWithReturn {
	
	// add two numbers
	
	int add (int a , int b)
	{
		return a + b;
//	
//		int result = a + b;
//		return result ;
	}
	
	int multiply (int a , int b)
	{
		return a * b;
		
	}
	
	double divide (double a , double b)
	{
		return a / b;
	}
	
	int givemesomthing () // this will always give 10
	{
		return 10;
	}
	
	void dontgivemeanything()
	{
		System.out.println("this will only show this statement on the screen ");
	}
	
	
	// create method that gets 3 doubles and return their average
	
	double average (double a, double b, double c)
	{
		return (a + b + c) / 3.0;
	}
	
	// create a method that receives int but returns string 
	
	String returnToString ( int a)
	{
		return ("your number is " + a);
	}

	
	

}
