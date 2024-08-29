package com.neotech.lesson04;

public class Casting {

	public static void main(String[] args) {
		
		
		double d1 = 3.7;
		
		System.out.println(d1);
		
		double d2 = 5;     // casting happened --> widening done automatically
		System.out.println(d2);
		
		// complier error type mismatch-- > cannot convert from double to int
		//int  num = 5.5;
		
		
		
		//Narrowing / manual casting, explicit casting
		
		// if i do this i am telling java i am sure i want to be stored in an int
		int num2= (int) 6.5;
		
		System.out.println(num2);
		
		byte b1 = (byte) 4578;
		
		System.out.println(b1);
		
		// int has 32 bit 
		// byte has 8 bit
		
		
		int num3 = 50;
		byte b2 = (byte) num3;
		System.out.println(b2);
		
		
		long L1 = 17L;
		int number1 = (int) L1;
		System.out.println(number1);
		
		
		long L2 = 856769476987845l;
		int number2 = (int) L2;
		
		System.out.println(number2);
		
		// another example 
		int number3 = 250;
		float f1 = number3;
		System.out.println(number3);
		
		
		float f2 = number3;
		
		
		
		
		
		
		
		
		
		
		
	}

}
