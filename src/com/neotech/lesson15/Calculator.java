package com.neotech.lesson15;

public class Calculator {
	
	
	
	
	// this class will have 3 methods: add multiply, and divide
	
	// add two number
	
	int add(int a, int b)
	{
	return  a + b;
	
	
	}
	
	void multiply(int a, int b)
	{
//	int result = a * b;
//	System.out.println(result);
		System.out.println(a*b); // this is same as using sum = a * b  -- i am doing multipying inside the parenthesis 
	
	}
	
	double div(double a, double b)
	{
	return  a / b;
	
	}
	
     void equal (int a ,int b)
     {
    	 if (a > b)
    	 {
    		 System.out.println(a + " is bigger than " + b);
    	 }
    	 else if (b > a )
    	 {
    		 System.out.println(a + " is bigger than " + a );
    	 }
     }
	
	
	
	
	

}
