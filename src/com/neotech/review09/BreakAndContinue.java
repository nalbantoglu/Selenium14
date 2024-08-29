package com.neotech.review09;

public class BreakAndContinue {

	public static void main(String[] args) {
		

		
		System.out.println("print numbers from 1 = 10 until 5 is found");
		
		
		for (int i = 1 ; i <=10; i++)
		{
			if ( i == 5) {
				break; // break will stop the loop when number 5 is found. no need to check rest of the numbers
				    // break has to be inside IF statement
			}
				
				
			
			System.out.print(i + " ");
		}
		
		// next statement
		
		System.out.print( "\n----- continue ");
		
		

		for (int i = 1 ; i <=10; i++)
		{
			if ( i == 5 || i == 6 || i == 9) { // i can have || OR condition her to skip numbers
			continue; // this will continue printing except number 5 
			}
				
				
			
			System.out.print(i + " ");
		
		
		}
	}

}
