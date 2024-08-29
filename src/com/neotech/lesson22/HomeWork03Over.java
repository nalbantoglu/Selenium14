package com.neotech.lesson22;

public class HomeWork03Over {
	
//	Homework 3:
//	    Create a class with 3 overloaded private methods.
//	    Then call each overloaded methods with specific arguments and observe the results.

	
	private void overLoad ()
	{
		System.out.println("This is default constructor");
	}
	
	private void overLoad (String day)
	{
		System.out.println("String --> " + day);
	}
	
	private void overLoad (String month, String day)
	{
		System.out.println("String and String --> " + month +" " + day);
	}
	
	private void overLoad (int year, int date)
	{
		System.out.println("int and int --> " + year + "-" + date);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		HomeWork03Over a = new HomeWork03Over();
		
		a.overLoad();
		
		a.overLoad("Saturday");
		
		a.overLoad("June", "Saturday");
		
		a.overLoad(2024, 15);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
 
	
}
