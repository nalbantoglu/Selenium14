package com.neotech.lesson12;

import java.util.Arrays;

public class RetreiveElements {

	public static void main(String[] args) {
		
		
		
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		System.out.println(Arrays.toString(grades));
		
		System.out.println();
		
		// how dp i get the values of array? which is printing 
		//1st way of doing it
		for (int i = 0; i < grades.length; i++)
		{
			System.out.print( grades[i]+", ");
		}
		
		System.out.println();
		
		System.out.println("=============");
		
		
		
		//2nd way enhanced for loop
		
		for(char grade : grades) // : colum has to be in between because it is syntax  // no need to run loop over and over
			//char grade will go over grades and it will print
		{
			System.out.print( grade +", ");
		}
		
		
		System.out.println("=============");
		System.out.println("=============");
		
		String[] fruits = {"apple", "orange", "cherry", "banana","grape"};
		
		// i want to name of the fruits 
		// if fruit is orange, i want to tell that its my favorite
		
		//1st way
		for (int i = 0; i < fruits.length; i++) // running loop to print fruits
			
		{
			if (fruits[i].equals("orange")) // while running this will find orange and print on the screen
			{
				System.out.println("orange is my favorite friut");
			}
			else
			{
				System.out.println(fruits[i]); // any other fruits will be print from here
				
			}
		}
		
		System.out.println("=============");
		System.out.println("=============");
		
		//2nd way enhanced for loop
		
		for (String fruit: fruits)  // this loop only works forward  
		{
			if (fruit.equals("orange"))
			{
				System.out.println("orange is my favorite friut");
			}
			else
			{
				System.out.println(fruit); // i have to use string name fruit to print rest of them
			}
		
		
		}
		System.out.println();
		System.out.println();
		
		// how do i print my array
		
		
		System.out.println(Arrays.toString(fruits)); // printing whole container using arrays.toString() this will print it as string
		
		
		
		
	}

}
