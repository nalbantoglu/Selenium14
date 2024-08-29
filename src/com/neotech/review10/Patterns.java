package com.neotech.review10;

public class Patterns {

	public static void main(String[] args) {
		

		/*
		 *  *
		 *  **
		 *  ***  rows
		 *  ****
		 *  *****
		 *  
		 */
		
		
		
		
		
		// outer loop will take care of the rows
		
		for (int row = 0; row < 5; row++)
		{
			
			//inner loop is responsible for the colums 
			for(int col = 0; col <=row; col++)
			{
			
				// i took care of rows
				//loop 1 : i must make sure that on the first row this only run 1 time
				
		
				System.out.print("*");
			
			}
			
			System.out.println(); // this will print empty lines 
			} 
		
		for (int row = 4; row > 0; row--)
		{
			
			//inner loop is responsible for the colums 
			for(int col = 0; col < row; col++)
			{
			
				// i took care of rows
				//loop 1 : i must make sure that on the first row this only run 1 time
				
		
				System.out.print("*");
			
			}
			
			System.out.println(); // this will print empty lines 
			} 
		
		
		
		

	}

}
