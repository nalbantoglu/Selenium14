package com.neotech.lesson11;

public class Task {

	public static void main(String[] args) {
		
		
		char [] grades  ; // creating char but non assigning any value or size
		
		grades = new char [6]; // assigning size 
		
		grades [0] = 'A';   //// assigning value
		grades [1] = 'B';
		grades [2] = 'C';
		grades [3] = 'D';
		grades [4] = 'E';
		grades [5] = 'F';
		
		System.out.println("the grade at index 1 is: " + grades[1] );
		
		
		char[] grades1 = new char[6];
		
		grades1 [1]= 'B';
		
		System.out.println("second way of creating and printing grade on index 1 is: " + grades1[1]);
		 	
		
		System.out.println("================================");
		
		
		
		
		//2nd way of doing arrays
		char[] grades2 = { 'A', 'B', 'C', 'D', 'E', 'F'}; // using curly bracket i can give value inside of it 
		                                                  // java know how many values i have inside the curly
		
		// once create this way i can not add anymore index
		
		
		
		
		
		
		
		
		
		

	}

}
