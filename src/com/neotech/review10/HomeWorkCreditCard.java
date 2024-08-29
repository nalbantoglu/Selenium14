package com.neotech.review10;

import java.util.Scanner;

public class HomeWorkCreditCard
{

	public static void main(String[] args) {
		

		
		//Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an "yes" from a user program should stop asking.
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		String answer;
		
		
		for (int i = 0; i < 10 ; i++)
		{
			System.out.println("do you wanna apply for a credit card");
			answer = scan.next();
			
			if ( answer.equalsIgnoreCase("yes"))
			{
				System.out.println("you got denied");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
