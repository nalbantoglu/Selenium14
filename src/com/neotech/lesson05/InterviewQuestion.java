package com.neotech.lesson05;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		
		/*
		 * *Interview Question:
          Write a Java Program to check whether number is Even or Odd.
		 */
		
		
		int num1 = 27;
		
		int remainder = num1 % 2;
		
		//System.out.println(remainder);
		
		
		// 1st way of checking 
		
		if (remainder == 1 )
		{
			System.out.println(remainder + "--this is odd number");
		}
		
		else 
		{
			System.out.println(remainder + " ---this is even number");
		}
		
		
		// 2nd way of checking odd or even
		
		if (remainder == 0)
		{
			System.out.println("this is even number");
		}
		else 
		{
			System.out.println("this is odd number");
		}
		
		//3rd way of checking
		
		if (num1 % 2 == 1)
		{
			System.out.println("this is odd number");
		}
		
	}

}
