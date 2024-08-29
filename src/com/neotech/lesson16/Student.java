package com.neotech.lesson16;

public class Student {

	
	/*
	 * Create a class Student that will have a method getGrade.
      Your method should accept the score of a student and return a grade:
	score > 90 - A
	score > 80 - B
	score > 70 - C
	score > 50 - D
	anything else - F
	 */
	
	
	
	// what do i need to know to create method
	
	// remember   input-----action -----output
	
	// what is the input ---       -----student score int
	//what is action to be performed ---- based on the score calculate letter grade
	// what is the output return type ---- student letter grade char 
	
	// return type methodNmae ---- input 
	
		// code logic 
		
		// return statement 
		
		char getGrade(int score)
		{
			// what is the way to follow to perform the action needed
			
			char grade ;
			
			if (score > 90)
			{
				grade = 'A';
			}
			else if (score > 80)
			{
				grade = 'B';
				
			}
			else if (score > 70)
			{
				grade = 'C';
				
			}
			else if (score > 50)
			{
				grade = 'D';
				
			}
			else 
			{
				grade = 'F';
				
			}
			return grade ;
			
		}
		
		public static void main(String[] args) {
			
			// i need student object to 
			
			Student st = new Student();
			
			char finalGrade = st.getGrade(85);
			
			System.out.println("The sudent final grade is: " + finalGrade);
		}
		
		
		
		
		
		
		
		
		
		
		
	
	
}
