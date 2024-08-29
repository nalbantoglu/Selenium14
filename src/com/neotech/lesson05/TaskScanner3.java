package com.neotech.lesson05;

import java.util.Scanner;

public class TaskScanner3 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		
		
		/*
		 * ask use to enter 2 number and print which one is larger
		 */

		
		
		System.out.println("Please enter first number");
		int num1 = number.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = number.nextInt();
		
		System.out.println("============");
		System.out.println("your number are " + num1 + " and " + num2);
		System.out.println("============");
		
		
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		}
		else if (num2 > num1)
		{
			System.out.println(num2 + " is larger than " + num1);
		}
		else if (num1==num2)
		{
			System.out.println(num1 + " is equal to " + num2);
		}
		else
		{
			System.out.println("");
		}
		
		
		
		
	}

}
