package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
	
		
		// order of arithmetic 

		
		int num1 = 5+5+5;
		
		System.out.println(num1);
		
		
		
	// nomrmally 15/4 is 3.75 is the result but becayse qe are storing it an int then decimal point is descarded
		
		
		int number1 = 15;
		int number2 = 2;
		
		int div = number1/number2;
		System.out.println("div -->" + div);
		
		int rem = number1 % number2;
		System.out.println("rem--> " + rem);
		
		
		System.out.println("addition vs concatination");
		
		int a = 10;
		int b = 10;
		
		String x = "java";
		String y = "tuesday";
		
		
		System.out.println(x+ " " + y); 
		System.out.println(x + y + a );
		System.out.println( x + y + b );
		
		System.out.println(x + ( a+b)); 
		
		
		
		
		
		System.out.println(x + y + a * b); // multiplication first
		
		
		
		//copliar error 
		//System.out.println(y * b); cannot multiply string with int
		
		
		
		/// int + int + int + string ------> string  -----addition will happen then concatination
		// string + int + int + int------> string    --all concationation
		
		
		
		
		
		
		
	}

}
