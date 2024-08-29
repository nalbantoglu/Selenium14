package com.neotech.officeHour07;

import java.util.Scanner;

public class Email02 {

	public static void main(String[] args) {

		/*
		 * 
		 * Write a program that will print out information about user based on email.
		 * Print first name, last name, and domain. First and Last name should be
		 * printed with proper format - uppercase first letter and remaining lowercase.
		 * Example:
		 * 
		 * Input: craig_federighi@apple.com
		 * Output: 
		 * First name: Craig Last name:
		 * Federighi Domain: apple
		 */

		 Scanner scan = new Scanner(System.in);
		   

		 String word = scan.next();
		 printInfo (word);
		 
		 
		
	//	 craig_federighi@apple.com
		
	}

	
	static void printInfo(String str)
	{
		String [] splitData = str.split("[_@.]");
		
		String name = splitData[0];
		String lastName = splitData[1];
		String domain = splitData[2];
		
		
		// get the first letter , capitalize it and then concat with the rest of the word
		String newName = name.substring(0,1).toUpperCase() + name.substring(1);
		String newLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		
		
		
		System.out.println("First name: " + newName);
		System.out.println("Last name: " + newLastName);
		System.out.println("Domain: " + domain);
	
	}
}
