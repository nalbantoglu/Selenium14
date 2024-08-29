package com.neotech.lesson20;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		

		
		// printing form default constructor
		
		ThisKeyword obj = new ThisKeyword();
		{
			obj.sum(20, 30);
			
		}
		System.out.println();
		
		ThisKeyword obj1 = new ThisKeyword(100, 300); // this is coming from local variable 
		{
			obj1.sum(100, 200); // sum of instance variable 
		}
		
		
		
		
	}

}
