package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//aka shorthand operator
		
		
		int num = 100; // we have a code b=value num--> 100
		
		System.out.println(num);
		
		num = 150;   //Reassign value 
		
		System.out.println(num);
		
		num = num + 150; // Reassigning , but this means add 150 to the current value
		 
		
		System.out.println(num);
		
		
		// we can do this operation in a shorter way-- we call this as compound/ shorthand operator
		
		num += 50; //num = num + 50     +=
		
		System.out.println(num);
		
		num -= 100;
		System.out.println(num);
		
		num /= 5 ;
		
		System.out.println(num);
		
	}

}
