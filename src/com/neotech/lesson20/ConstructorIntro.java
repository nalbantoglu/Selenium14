package com.neotech.lesson20;

public class ConstructorIntro {
	
	// some features:
			String name;
			int age;
			
			// Declaring constructor
			// name of the constructor has to be same with name of the class
			// there is no return for constructor
			
			 ConstructorIntro()
			 {
				// System.out.println("I am the default constructor");
				 
				 
				 
				 
				 
				 
				 
				 
			 }
			 
	

	public static void main(String[] args) {
		

		ConstructorIntro con = new ConstructorIntro();
		
		System.out.println(con.name);
		
		
		ConstructorIntro con2 = new ConstructorIntro();
		
		con.name = "Prethi";
		con.age = 25;
		
		System.out.println(con.name + " " + con.age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
