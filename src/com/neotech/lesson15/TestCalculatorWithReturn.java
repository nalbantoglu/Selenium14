package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {
		
		
		
		CalculatorWithReturn cal = new CalculatorWithReturn();
	
		
		int result = cal.add(10, 5); // i saved it into result
		
		
		System.out.println(result); // and i can save the result into result varible
		
		// OR 
		System.out.println(cal.add(10, 5)); // i can print it like this 
		
		
		//Multiplication
		System.out.println(cal.multiply(28, 55)); //direct printing 
		
		
		//division
	    double result1 = cal.divide(15.4, 2.7);
	    System.out.println(result1);
	    
	    System.out.println("Average of 5,7 and 3 is: " + cal.average(5, 7, 3));
	    
	    
	    //multiply 2 with the average of 5,7 and 3
	    System.out.println(cal.multiply(2, (int) cal.average(5, 7, 3))); // casting from double to int
	    
	    
	    
	

   
		
		
		
		
		
		
		

	}

}
