package com.neotech.review08;

public class Recap {

	public static void main(String[] args) {
		
		// print Good Morning 5 times

				// not a good solution.
//				System.out.println("good morning");
//				System.out.println("good morning");
//				System.out.println("good morning");
//				System.out.println("good morning");
//				System.out.println("good morning");

				// we handle the code repetition using loops

				// what we need:
				// how many times the code needs to run
				// what is the staring point?
				// what the the stopping criteria
				int count = 1;
				while (count <= 5) {
					System.out.println("good morning");
					count = count + 1;
					// count += 1; //shorthand operator
					// count++; //increment
				}

				
				System.out.println("-------------");
				// using do-while loop

				int num = 1;
				do {
					System.out.println("good morning");
					num++;
				} while (num <= 5);

				System.out.println("-------------");
				
				

				int m = 10;
				while (m < 5) {
					System.out.println("Today is a wonderful day!(while)");
					m++;
				}

				m = 5;
				do {
					m++;
					System.out.println("Today is a wonderful day! (do-while)");
				} while (m < 5);

		//next statement
	
		
		
	}

}
