package com.neotech.review10;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		//Write a program that asks user to enter his/her username and password until user enters them correctly.
		
		
		String u = "user";
		String p = "password";
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		// input from the use trying to login
		String user;
		String password;
		
		
		// ask user for credential      more suitable for DO WHILE because we will ask first
		
		// check if they are true
		  // if credentials are correct then end the loop
		  // if credential are incorrect then go to step 1
		
		boolean  flag = true;
		
		
		
		do 
		{
			
			System.out.println("enter your username and password");
			user = scan.next();
			password = scan.next();
			
			if (user.equals(u) && password.equals(p))
				
				System.out.println("you are logged in");
			break;
			//flag = false;
			
			
				
			
		}
		while (true);
		// while (flag);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
