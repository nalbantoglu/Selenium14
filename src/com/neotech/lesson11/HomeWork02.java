package com.neotech.lesson11;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
//		
//		Ask the user to enter an integer and build the following pattern:
//			Hint: Use scanner, if user entered number 5, there should be two parts
//			The first part, 1 to 5
//			The second part, 4 to 1
//
//			1 
//			1 2 
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		
		int num = scan.nextInt();
		
		for (int i = 1; i <=5; i++)
		{
			
			for ( int j = 1; j <= i ; j++) // i have run j one less every time to decrease numbers
			{
				System.out.print(j + " ");
			}
			
		
			System.out.println();
		
			
		}
		//second for loop
		for (int i = num-1; i >=1; i--) // starting 4 will print one less number on reverse
		{
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j+ " ");
			}
			

			
			
			System.out.println(); // must have this to add new lines 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
