package com.neotech.review10;

public class Task1 {

	public static void main(String[] args) {
		
		
		/*
		 * print the following
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 
		 */
		
		for (int i =1; i <= 5; i++) // this must increment
		{
			// each row has certian amoutn of colums
			
			// 1st inner loop needs to run only once 
			for (int j = 1; j <=i ; j++)
			{
		
			
			System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

}
