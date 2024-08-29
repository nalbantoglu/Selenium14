package com.neotech.review10;

import java.util.Scanner;

public class HomeWorkStars {

	public static void main(String[] args) {
	
		/*
		 * Ask the user to enter an integer and build the following pattern:
         Hint: Use scanner, if user entered number 5, there should be 5 rows.
         In the first row, 0 spaces, (2 * 5) - 1 stars
         In the second row, 1 spaces, (2 * 4) - 1 stars
         In the third row, 2 spaces, (2 * 3) - 1 stars
         In the fourth row, 3 spaces, (2 * 2) - 1 stars
         In the fifth row, 4 spaces, (2 * 1) - 1 stars

*********
 *******
  *****
   ***
    *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		
		int num = scan.nextInt();
		
		for ( int i = 0; i< num; i++) // outer loop
		{
			
			// this controls the rows 
			for ( int j = 0; j < i ; j++) 
			{
				System.out.print(" ");
			}
				for ( int k = 0; k < 2*(num - i) - 1; k++)
				{
					System.out.print("*");
				}
		
		
		System.out.println();
	}
		
	}

}
