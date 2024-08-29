package com.neotech.lesson11;

public class Recap {

	public static void main(String[] args) {
		
		
		
		/*
		 *         *
		 *        * *
		 * 
		 */
		
		
		
		for ( int i = 1; i <= 5; i++ ) // this will only run 5 times
			
		{ // 1st row: 4 spaces + 1 star
			// 2st row: 3 spaces + 2 star
			// 3st row: 2 spaces + 3 star
			// 4st row: 1 spaces + 4 star
			
			// loop for spaces. this will loop do more spaces at the beginning 
			for (int j = 5; j > i; j--)
			{
				
				System.out.print(" ");
		
				
			}// loop for starts
			
			for (int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			
			
			
			
			System.out.println() ; // same as hitting enter. it will print empty line
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
