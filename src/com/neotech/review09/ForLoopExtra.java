package com.neotech.review09;

public class ForLoopExtra {

	public static void main(String[] args) {
		
		System.out.println("print number from 21 to 30");
		
		System.out.println("   ");
		
		for (int i = 21; i <= 30 ; i++) 
		{
			System.out.print(i + " ");
		}
		
		System.out.println("  ");
		System.out.println(" ------  ");
		
		
		
		System.out.println("\nprint even number from 20 to 1"); // \n will make it to jump next line
		
		for (int i = 20 ; i >=1; i = i - 2) { // i - 2 subtract 2 from i and find even numbers only 
			                              // i is 20 - 2 makes it 18 and every time code runs it will decrease by 2 so i dont have to count odd numbers
			System.out.print(i + " ");
			
		}
		
		System.out.println("       ");
		System.out.println(" ------  ");
		
		System.out.println(" print ODD number from 0 to 10");
		
		for (int i = 1 ; i <= 10; i = i += 2) {
			
		
			System.out.print(i + " ");
		}
		
		System.out.println(" ------  ");
		System.out.println(" ------  ");
		
		// 2nd way
		for (int i = 0; i <= 10 ; i++)
		{ if ( i% 2 == 1)
			System.out.print(i + " ");
		}
		
		System.out.println(" ------  ");
		
		System.out.println("\n calculate the sum of odd number from 1 to 10  ");
		int sum = 0;
		
		for (int i = 1; i <= 10 ;i +=2) // i+=2 we are adding 2 to i initial value which adds 2 to 1 and makes it 3 which is odd number
		{
			sum += i; // everytime code runs i value will be added to sum ( i1 = sum 1   i3= sum 4 so on 
			
		}
		
		System.out.println(" sum of the odd number is  " + sum);
		
		
		
		
		

	}

}
