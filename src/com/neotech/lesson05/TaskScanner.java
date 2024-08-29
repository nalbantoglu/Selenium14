package com.neotech.lesson05;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
		 * enter first name 
		 * enter last name
		 * then print full name 
		 * 
		 */

		System.out.println("enter your name ");
		String name = input.next();
		
		System.out.println("enter you last name");
		String lastName = input.next();
		
		System.out.println("your full name is: " + name +" " + lastName);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
