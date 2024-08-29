package com.neotech.lesson15;

public class Tasks {

	/*
	 * method1: Create a method that will take 2 parameters as numbers and prints
	 * which number is larger.
	 * 
	 * method2: Create a method that will take a number and prints whether the
	 * number is even or odd.
	 * 
	 * method3: Create a method that will say Hello in a different language based on
	 * the country that will passed when method is executed.
	 */
	
	void Larger(int a ,int b)
	{
		if (a > b)
		{
			System.out.println(a + " is larger");
		}
		
		else if (b > a)
		{
		System.out.println(b + " is larger");
     }
	else 
	{
		System.out.println(a + " and " + b + " are equal" );
	}
		}
	
	
	void evenOrOdd(int num)
    {
		if (num % 2 == 0)
		{
			System.out.println(num + " is even");
		}
		else 
		{
			System.out.println(num + " is odd");
		}
		
	 }
	
	
	void sayHello(String country)
	{
		switch (country)
		{
		case "Turkiye":
			System.out.println("Merhaba");
			break;
			
		case "USA":
		case "UK":
			System.out.println("Hello");
			break;
			
		case "Mexico":
			System.out.println("Hola");
			break;
			
			default:
				System.out.println("I dont know this " + country);
				break;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
	     
		Tasks task = new Tasks();
		
		task.Larger(43, 21);
		task.Larger(3, 3);
		
		System.out.println();
		
				
		task.evenOrOdd(21);
		task.evenOrOdd(93756832);
		
		System.out.println();
		
		task.sayHello("Turkiye");
		task.sayHello("USA");
		task.sayHello("Mexico");
		task.sayHello("Bulgaristan");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
