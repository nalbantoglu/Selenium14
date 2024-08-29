package com.neotech.lesson03;

public class ModulusOperator {

	public static void main(String[] args) {
		
		
	int a = 13;
	int b = 5;
	
	int div = a/b; // result is 2 what is after decimal point is lost 
	
	System.out.println("division->" + div);
	
	
	//remainder --> 13/5=2   2*5=10 --> 13-10=3
	int remainder = 13%5; // % modulus will find the remainder left from 13/5 whis is 3
	
	System.out.println(remainder);
	
	//dividing doubles
	
	double d1 = 13;
	double d2 = 5;
	
	double res= d1/d2;
	
	System.out.println(res);
	
	// last explanation
	
	int num1 = 17; //i have 17 cars and 
	int num2 = 4;  //i wanna divide between my 4 kids
	
	int rem = num1 % num2;
	System.out.println("left with " + rem);
		
		
		
		

	}

}
