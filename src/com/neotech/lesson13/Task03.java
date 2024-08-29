package com.neotech.lesson13;

public class Task03 {

	public static void main(String[] args) {
		
		
		
		
		// print sum of all numbers
		
	        int [][]numbers = 
				
			{
				{1,2,5,6},
				{3,8,},
				{10,11,15},
						
		        };
		
		int sum = 0;
	  
	        for (int row = 0; row < numbers.length; row++)
	        {
	        	for (int col = 0; col < numbers[row].length; col++)
	        	{
	        		sum += numbers[row][col];
	        	}
	        	
	        }
	        System.out.println("total of the sum is: " + sum);
	
	        System.out.println("+=================");
	        
	        int sum2= 0;
	        
	        for (int [] row : numbers)
	        {
	        	for (int colValue : row)
	        	{
	        		System.out.print(colValue + " ");
	        		sum2 += colValue;      // here i am adding all the numbers as loop keep running 
	        	}
	        	System.out.println();
	        }
	        System.out.println("total of for each sum2 is: " + sum2);
	
	
	
		
	}

}
