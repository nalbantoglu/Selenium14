package com.neotech.lesson12;

public class Task02 {

	public static void main(String[] args) {
		
		
		
//		Create an array of integers and calculate the sum of all elements in the array
//		(use 2 different loops).
		
		
		int[] num =  {45, 52,67,89,91};
		
		int sum = 0;
		 
		// using indexed for loop
		
		for (int i = 0; i < num.length; i++)
		
		{
			sum += num[i];
			
		}
		System.out.println("the sum is: " + sum);
		
		
		// using enhaced loop
		int sum2 = 0;   ////////i have to have second sum 
		for (int number : num)
		{
			sum2 += number;
		}
		System.out.println("the sum is: " + sum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
