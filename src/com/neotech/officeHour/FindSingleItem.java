package com.neotech.officeHour;

public class FindSingleItem {

	public static void main(String[] args) {
		
//		Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
//		Example:
//		nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
		
		
		
		int numbers [] = {1, 1, 2, 2, 3, 4, 3, 4, 6 , 6, 7, 8 };
		
		int count = 0;
		
		

		
		for (int number : numbers)
		{
			
			for (int num : numbers)
			{
				if (number == num)
				{
					count++; // count have to be here keep counting
					
					
				}
			}
			
			if (count == 1 )
			{
				
			System.out.println(number + " ");
			count = 0; // i nned to reset the counter 
			
			}
			else 
			{
				count = 0;
				
			}
			
			

			
		}
		
		
		

	}

}
