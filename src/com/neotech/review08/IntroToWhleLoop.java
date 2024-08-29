package com.neotech.review08;

import java.util.Scanner;

public class IntroToWhleLoop {

	public static void main(String[] args) {
		
		
		
		// print number from 1 to 10
		// to avoid loop that runs forever (infinite) we need control variable
	
		int num =1;
		
		
		while (num <= 11) // if i needs to print 1 to 10 (<= 11) sprint will stop at 10
			// increment and decrement could be controlled in the parenthesis 
		{
			System.out.print(num + " "); // if i need it on same line i have to delete ln from println
			
			
			num++; // increment or decrement must be inside the while loop brackets
			// my num keeps increasing so loop has to end at same point
		
		}
		
		System.out.println();
		// another way to do same thing
		
		num= 1;
		
		while (num < 11) 
		{
			
			System.out.print(num++ + " "); //printing and increasing number by 1
		}
		
		System.out.println();
		// how can i enter 5 number from the console
		
		Scanner scan = new Scanner(System.in);
		int var = 5;
		//idea 1 start with 1, while var is <= 5 perform the action incrementing (++)
		//idea 2 start with 5 while var is bigger than 0 perform the action decrementing (--)
		
		
		
		
		while (var >0)
		{
			
			System.out.println("enter a number");
			int n = scan.nextInt();
			System.out.println("the number is :" + n);
			
			var-- ;
			
		}
		
		
		
		

		
		
		
		

	}

}
