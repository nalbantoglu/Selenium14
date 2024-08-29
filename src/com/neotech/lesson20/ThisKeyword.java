package com.neotech.lesson20;

public class ThisKeyword {
	
				 
	
			int a,b;
			
	
	
			public ThisKeyword()
			{
				
				
				
				
			}
			
			ThisKeyword (int a, int b)
			{
				// i want to assign the value of my instance variables 
				// using the constructors parameter
				// but they  both share same name , so i have to differentiate them from each other
				// this keyword makes sure that it is points to the same instance variable 
				
				this.a = a ; // "this" represent the class
				this.b = b;
			}
			
			
			
			
			
			
			
			
			
			
			void  sum(int a , int b)
			{
				System.out.println("sum of local variables: " + (a + b ));
				System.out.println("sum of instance variables: "+ (this.a + this.b));
			}
	
	

}
