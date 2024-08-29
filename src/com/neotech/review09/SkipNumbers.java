package com.neotech.review09;

public class SkipNumbers {

	public static void main(String[] args) {
	
		
		// print numbers from 10 to 1 and skip 3, 6, 9 
		
		for (int i = 10;  i >= 1 ; i--)
		{
			if (i % 3 == 0) { // i can tell code to print all the number except those 3.6.9
				continue;
			//if (i == 3 || i== 6 || i == 9) {
			//	continue;
			}
			
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n---------------");
		
		//print numbers from 20 to 40
		    // but skip 27 to 33
		
		for (int i = 20; i <=40 ; i++)
		{
			if (i >= 27 && i <= 33) // skip any number greater or equal to 27 and less or equal to 33
				//with && operator i am telling java to skip number 27 to 33
			continue;
			
			
			System.out.print(i + " ");
		}
		
		
	}

}
