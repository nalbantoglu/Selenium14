package com.neotech.lesson05;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter your name ");
		String name = input.next();
		System.out.println("your name is: " + name);
		
		
		System.out.println("enter you age");
		int age = input.nextInt();
		System.out.println("your age is: " + age);
		
				
		System.out.println("enter your age as double ");
		double ageDouble = input.nextDouble();
		System.out.println("your age in double is: " + ageDouble);
		
		
		System.out.println("is it raining (true or false");
		boolean raining = input.nextBoolean();
		System.out.println("is it raining " + raining);
		
		
		
		
	}

}
