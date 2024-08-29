package com.neotech.lesson13;

public class HomeWorkNumbers {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		/*
		 * 1) If the number you're checking greater than maximum number, the maximum
		 * number will be second number. -> if (theNumberWeChecking > theFirstOne)
		 * {theSecondOne = theMaximum; theMaximum = theNumberWeChecking;
		 * 
		 * 2) If the number you are checking Is bigger than the second number AND 
		 * the number you are checking is not the largest number. 
		 * Then the current number will be the second largest number -> 
		 * 
		 * }else if (theNumberWeChecking > theSecondOne && theNumberWeChecking != theMaximum) 
		 * { theSecondOne = theNumberWeChecking;
		 */
 
		int[] numbers = { 3, 4, 5, 2, 9, 0, 1 };
		

		int max = numbers[0];
		int min = numbers[0];
		int secondMax= numbers[0] ;   // = numbers[0];
		
		for (int i= 0; i < numbers.length; i++)
		{
			if (numbers[i] > max) //if numbers[i] is bigger than max  max is bigger now
			{
				// assign second max before we change it 
				secondMax = max; // now second max is == to max 
				max = numbers[i];
				
			}
			if (numbers[i] < min)
			{
				min = numbers[i];
				
			}	
			
		}
		System.out.println(max+ "  " + min + "  " + secondMax + " ");

	}

}
