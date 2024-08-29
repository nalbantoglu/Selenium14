package com.neotech.review09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		//ask a user guess the number
		//your lucky number is 5
		
		
		// as long as the entered number is not 5 we keep trying
		//once the number is correct we print you are a winner
		
		
		Scanner scan = new Scanner(System.in);
		
		int lucky = 5;
		int userGuess ;
		System.out.println("guess my lucky number! ");
		userGuess = scan.nextInt();
		
		
// using while loop[
		
		while (userGuess != lucky) //as long as user guess wrong this condition will run on the loop
		{
			System.out.println(" no try again");
			userGuess = scan.nextInt();
			
		}
		System.out.println("you are the winner"); // after user guess the number this line would be printed
		
		
		
		
		
		
		
		
		

		
	}

}
