package com.neotech.lesson22;

public class HomeWork02 {
//	
//	Homework 2:
//	    Create a class with 3 overloaded static methods.
//	    Then call each overloaded methods with specific arguments and observe the results.

	
	static void over (double weight, double height)
	{
		System.out.println("weight is --> " + weight + " " + "height is: " + height);
	}
	
	static void over (String name , String lastName)
	{
		System.out.println("String and Sting --> " + name + " " + lastName);
	}
	
	
	static void over (String hairColor , String eyeColor , int age)
	{ 
		System.out.println("String - String and int --> " + hairColor + ", " + eyeColor + ", " + age);
	}
	
	
	
	public static void main(String[] args) {
		
		
		over(186.7, 5.7);
		
		over ("Abit" , "Soylu");
		
		over("Bold" , "Green" , 40);
		
		
		
		
		
		
	}
	
}
