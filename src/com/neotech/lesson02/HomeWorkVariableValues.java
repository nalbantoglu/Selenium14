package com.neotech.lesson02;

public class HomeWorkVariableValues {

	public static void main(String[] args) {

		// 2. Create a Java program and name it VariableValues
//		In your program create variables to store all different types of primitive data.
//		Print the value of each variable.
//		Update value of each variable.
//		Print the value of each variable after updating.

		// initial declaring and assigning values

		byte first = -7;
		short second = 9576;
		int third = 85097767;
		long forth = 35234945;
		float fifth = 94.48f; // float must have f at the end 
		double sixth = 94857.8464;
		char seventh = '%';
		boolean ninth = true;

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(forth);
		System.out.println(fifth);
		System.out.println(sixth);
		System.out.println(seventh);
		System.out.println(ninth);

		System.out.println(" Reassigning values");

		first = 65;
		second = 236;
		third = 9746;
		forth = 7534;
		fifth = 2.5f;
		sixth = 98.4;
		seventh = '$';
		ninth = false;
		
		//after reassigning must print to confirm
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(forth);
		System.out.println(fifth);
		System.out.println(sixth);
		System.out.println(seventh);
		System.out.println(ninth);

	}

}
