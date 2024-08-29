package com.neotech.lesson13;

public class RetrevingValuesUsingForEachLoop {

	public static void main(String[] args) {
		

		
		
		String[][] animals= 
			{
					{"cat","dog","bird"},
					{"tiger","lion","bear"},
					{"salmon","shrip","seabass","tuna"},
			};

		
		
		   // initialization;   condition     increment
		
		for (int row = 0; row < animals.length; row++) //runs // 0 ,1 ,2
		{
			for (int col = 0 ; col < animals[row].length; col++)
			{
				System.out.print(animals[row][col] + " "); // printing row and columns of animals 
			}
			System.out.println();
			
		}
		
		System.out.println("===================");
		
		// using for each loop
		for ( String[] row : animals ) // go through each 1D array in the animals 2D array
		{
			for ( String col : row ) // no need to increment 
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
