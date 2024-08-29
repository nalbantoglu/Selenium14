package com.neotech.review08;

import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		
		
		
		
Scanner scan = new Scanner(System.in);
		
		int lucky = 5;
		int userGuess ;
		int guess = 3;
		//System.out.println("guess my lucky number! ");
		//userGuess = scan.nextInt();
		
		
		//using do while loop
		
		// do while seems to be better fit here 
		
		do 
		{
			System.out.println("guess my lucky number! ");
			userGuess = scan.nextInt();
			if (guess == 3)
				break;
			{
				System.out.println("you are out");
			}
			guess++;
			
			
		} 
		
		
		while (userGuess != lucky);
			

		System.out.println("you are the winner");
		
	}

}
