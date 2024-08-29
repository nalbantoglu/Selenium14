package com.neotech.review09;

import java.util.Scanner;

public class HomeWorkCredit {

	public static void main(String[] args) {
		
		// Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an "yes" from a user program should stop asking.
       
		Scanner scan = new Scanner(System.in);
		
		
		
		String answer = null ;
		
		
		
		for ( int b = 1; b <= 10 ; b++)
		{
			System.out.println("Would you like to apply for credit card");
			answer = scan.next();
			
		
		
		if (answer.equalsIgnoreCase("yes"))
			
		{
			System.out.println("Thank you for applying. Based on your credit history we are not able to offer you credit card :) " );
			break;
			
		}
		}
		
		
		
		
		
		
		
		
	}

}
