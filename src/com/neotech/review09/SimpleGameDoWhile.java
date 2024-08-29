package com.neotech.review09;

import java.util.Scanner;

public class SimpleGameDoWhile {

	public static void main(String[] args) {
		
		/*
		 * ask user ; guess the number
		 * your lucky number is 5
		 * 
		 *  as long as the entered number is not 5, we keep trying
		 *  once the number is correct, we print you are the winner
		 *  
		 *  
		 *  i needs to ask user and
		 *  capture that input
		 *  compare that with what i have
		 *  
		 */
		

		
		Scanner scan = new Scanner(System.in);
		int myLuckyNumber = 5;
		int userGuess;
		
		//System.out.println("guess my lucky number");
//		// using a WHILE LOOp
//		userGuess = scan.nextInt();  // getting information from console and assigning to userguess
//		
//		while (userGuess != myLuckyNumber) //this condition has to be true to stop running the code
//			//if user doesnt guess my number this code will run forever
//		{
//			System.out.println("no! try again");
//			userGuess = scan.nextInt(); 
//			
//		} 
//		System.out.println("you are the winner");
		
		//scan.close(); // scanner will not scan
		
		
		// using do WHILE
		// do while seems to be better fit here
		int guesscount = 1;
		
		do {
		System.out.println("guess my lucky number"); //this will run at least 1 time. if user guesses right then it will move below to code to print 
			userGuess = scan.nextInt();
			
			
	}
			while (userGuess != myLuckyNumber ); 
			
				//System.out.println("keep trying");
		System.out.println("you are the winner");
		
	}
		
		
	}


