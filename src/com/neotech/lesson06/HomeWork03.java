package com.neotech.lesson06;

public class HomeWork03 {

	public static void main(String[] args) {
		
		
		
		//check if number is even or odd
		
		
		int number = 325;
				
		
		System.out.println(number % 2);
		
		
	//	1st way of checking
		if (number % 2 == 0)
		{
			System.out.println( " number is even number");
		}
		
		else 
		{
			System.out.println("number is odd");
			
		}
			

		
		// 2nd way of checking
		
		if (number % 2 == 1)
		{
			System.out.println("this number is odd");
		}
 
		else 
		{
			System.out.println("this number is even");
		}
		
		//3rd way of checking
		
		int remainder = number % 2;
		 
		System.out.println(remainder);
		
		if (remainder == 0)
		{
			System.out.println("this is even number");
		}
		
		else 
		{
			System.out.println("this is odd number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
