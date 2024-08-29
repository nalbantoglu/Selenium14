package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrays {

	public static void main(String[] args) {
		

		String [][] months = {
				   
				{"December" , "January" , "February"},
				
				{"March" , "April" , "May"},
				
				{"June" , "July" , "August"},
				
				
				{"September" , "October" , "November"},	
		};
				
 // the arry months has two dimensions [4] [3]
		
		int rows = months.length; // returns the numbers of rows in the 2D array
		System.out.println(rows + " rows");
		
		
		int cols = months[1].length;
		System.out.println(cols + " columns");
		
		
		System.out.println("==================");
		
		// for every element i need two  - [] [] 
		
		for (int row = 0; row < rows; row++)
		{
			//System.out.println(row);
			for (int col = 0 ; col < cols; col++)
			{
				System.out.println(months [row] [col] + " ");
			}
			
		}
		
		System.out.println("==================");
		System.out.println("==================");
		
		
		
		int [][]numbers = 
			
			{
				{1,3,4,6},
				{4,6,7,17,8,9,3},
				{10},
				{11,12},
						
		        };
		
		
		
		for (int row = 0; row < numbers.length; row++)
			
			
			
			// when row = 0 column will go from 0 to 3
			// when row = 1 column will go from 0 to 6
			// when row = 2: column will run just for 1 index
			// when row = 3 column will run 0 and 1 ( two times
		{
			
			// numbers[row] ----> i am referring to a row (9 3  5 5 )
			// numbers [row][col] -->i am referring to a value
			for(int col = 0; col < numbers[row].length; col++)
			{
				System.out.print(numbers [row] [col]+ " ");
			}
			
			
			
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
