package com.neotech.lesson13;

public class Task01 {

	public static void main(String[] args) {
		
		
		int largest = 0;
		
		int [][]numbers = 
				
			{
				{1,3,4,6},
				{4,6,},
				{10,11,12},
						
		        };
		
		
		
		for (int row = 0; row < numbers.length; row++)
		{
			for (int col = 0; col < numbers[row].length; col++)
			{
				if (numbers[row][col] > largest) { 
					
					largest = numbers[row][col];// adding if to print only even or odd number
					
					}
				
				
				
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println(); // this has to be in the initial for loop
		}
		System.out.print("The largest is " + largest);
			
		
		
		System.out.println("+=================");
		
		// for each loop 
		
		for (int[] row : numbers) // row is just an identifier
		{
			for (int col : row) // col  is just an identifier
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		
		// do i need a nested for loop structure to print the first column
		
	
		
	}

}
