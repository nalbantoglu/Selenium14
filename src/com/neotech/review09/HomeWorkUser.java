package com.neotech.review09;

import java.util.Scanner;

public class HomeWorkUser {

	public static void main(String[] args) {
		
		//2. Write a program that asks user to enter his/her username and password until user enters them correctly.

		
		Scanner scan = new Scanner(System.in);
		
		String user;
		int pass, num;
		
		num = 0;
		
		while (num < 2)
		{
			System.out.println("Enter your username and password: ");
			user = scan.next();
			pass = scan.nextInt();
		
			
			if (user.equals("admin") && pass == 1234)
			{
				System.out.println("Welcome back ");
				num++;
				break;
			}
			else 
			{
				System.out.println("Wrong information, try again");
			}
			
			
			
			
			
			
			
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

