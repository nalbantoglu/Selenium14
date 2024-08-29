package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWorkDmv {

	public static void main(String[] args) {
		
		/*
		 * You are DMV representative and you need to ask customer their age.
          If they are 18 and older you will issue a driver license to them, 
          otherwise you will offer them to get a learners permit.
		 */
	
		
		
		
		Scanner dmv = new Scanner(System.in);  // variable after scanner is what computer will scan
		

		int student = 16;
		
		System.out.println("Enter your age: ");
		int age = dmv.nextInt();
		
		if (age >= 18)
		{
			System.out.println("You are eligible to get driver license ");
		}
		
		else 
		{
			System.out.println("Only eligible for learners permit. ");
		}
		
		
		
		
		
	}

}
