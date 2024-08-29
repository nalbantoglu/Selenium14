package com.neotech.lesson13;

public class HomeWorkInterviewQuestion {

	public static void main(String[] args) {
	
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
				
		
		
		int[][] b = 
			{ 
				{ 2, 3, 5 }, 
				{ 2, 4, 7 }, 
				{ 8, 1, 9 }, 
				{ 3, 15, 1 } 
		};
		
		int max = b [0] [0];
    	int min  = b [0] [0];;
    	int second = b [0] [0];;
		
		System.out.println("Enhaced For LOOP");
		
		for (int [] row : b)
		{
			
			for (int  element : row)
				
			{
				if (element > max)
				{
					max = element;
					
					if (min > element && min < max)
					{
						
					}
					if (second > element)
					{
						
					}
				
				 
					
				}
				
		
				//System.out.print(element+ " ");
			}
			
		}
		System.out.println("max number is--> " + max);
		System.out.println("minum number is--> " + min);
		System.out.println("second bigger number is--> " + second);
		System.out.println("==============");
   
       }

}
