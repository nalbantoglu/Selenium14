package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWorkDay {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 2. Write a program that will ask for the day (a number from 1-7). 
		 * Print whether it is a weekend or weekday.
	        If any day from 1-5 → output "It is a weekday"
	        Any day from 6-7 → output "It is a weekend",
	        Any other day → output "Invalid day"
		 */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the day(numbers only)");
		byte day = scan.nextByte();
		
		if (day >= 1 && day < 5)
		{
			System.out.println("It is a weekday");
		}
		else if (day == 6 || day == 7)
		{
			System.out.println("it is a weekend");
		}
		
		else 
		{
			System.out.println("invalid day");
		}

	}

}
