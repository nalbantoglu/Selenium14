package com.neotech.lesson13;

public class Task02 {

	public static void main(String[] args) {
		
		
		
		// find even numbers only 
		
		

		int [][]numbers = 
				
			{
				{1,2,5,6},
				{3,8,},
				{10,11,15},
						
		        };
		
		
		
		for (int row = 0; row < numbers.length; row++)
		{
			for (int col = 0; col < numbers[row].length; col++) // [row] length will go through all the rows 1 by 1
			
			{
				if (numbers[row][col] % 2 == 0) {    // adding if to print only even or odd number
				System.out.print(numbers[row][col] + " is even ");
				}
				//else 
				//{
					//System.out.print(numbers[row][col] + " is odd ");
				//}
			}
			System.out.println(); // this has to be in the initial for loop
		}
			
		
		
		System.out.println("+=================");
		
		// for each loop 
		
		for (int[] row : numbers) // 
			
			for (int col : row) //
			{
				if (col % 2 == 0 )
				{
				System.out.print(col + " ");
				}
				System.out.println();
			}
			
		}
		
		

	

}
