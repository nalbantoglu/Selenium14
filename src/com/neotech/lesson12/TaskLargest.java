package com.neotech.lesson12;

public class TaskLargest {

	public static void main(String[] args) {
		
//		** Create an array of integers and calculate the largest element in the array
//		(use 2 different loops).
		
		
		int[] num =  {45, 52,67,89,91, 10, 75, 40, 101};
		
		
		// for loop 
		// lets assume the first number is the largest
		
		int largest = num[0]; // my largest is index 0 which will be equal to largest .. starting point
		// if i set my lasrget number as 0, it will problem if i have mines numbers -43
		
		// in order to find the largest array, i need to go through all the  elements
		
		
		for (int i = 0; i < num.length; i++)
		{
			
			if (num[i] > largest) 
			{
				largest = num[i];
				
			}
			
		}
		System.out.println("the largest is: " + largest);
		
		
		
		for (int numbers: num)
		{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
