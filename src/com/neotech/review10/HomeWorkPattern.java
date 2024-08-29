package com.neotech.review10;

import java.util.Scanner;

public class HomeWorkPattern {

	public static void main(String[] args) {
		
//		/*
//		 * Ask the user to enter an integer and build the following pattern:
//         Hint: Use scanner, if user entered number 5, there should be two parts
//         the first part, 1 to 5
//         The second part, 4 to 1
//
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1
	 
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		
		int user;
		user = scan.nextInt();
	
		for (int i = 1; i <=5; i++)
		{
			
			for (int j = 1; j <=i ; j++)
			{
				//System.out.print("");
			}
			 for (int k = 1; k< 2*(user-i)- 1; k++)
			
			 {
				 System.out.print(i);
			 }
			
			
			
			
			
			
			
			
			
			
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
