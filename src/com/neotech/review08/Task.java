package com.neotech.review08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		// how can i print only even number from 50 to 1
		// 50 48 46 44
		  // this tells me first number should be 50
		  // last number should be 2
		  //must ude dercement
		
		int x = 50;
		  // stop at last true condition which is 2
		int sum = 0;
		
		
		
		while (x > 1)
		{
			System.out.print(x + " ");
			
			
			// first way of doing it simple situation
			x = x-2;
			
		}
		
		System.out.println();
		
		//second way
		
		int y = 50;
		
		while (y >1 )
		{
			// this will loop go throught all these values 50,49,48,47
			// we need an if condition the only print if they are even
			
			if (y % 2 == 0)
			
			System.out.print(y + " ");
			
			
			y-- ;
			
			System.out.print(" ");
			
			
		}
	
		System.out.print(y);

	}

}
