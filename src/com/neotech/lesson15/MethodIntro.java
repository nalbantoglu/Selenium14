package com.neotech.lesson15;

public class MethodIntro {
	
	// this method does not return anything  
	// it only print on the screen
	// and it does not receive any parameters
	
	void greet () //method header
	//method body
	{
		System.out.println("hello");
		System.out.println("how are you doing?");
		System.out.println("bye!");
	}
	
	void greet2(String name) // no return but excepts premitier
	{
		System.out.println("hello " + name);
		System.out.println("how are you doing? " + name);
		System.out.println("bye! " + name);
	}


	public static void main(String[] args) {
		

	
		
		// how to call greet method
		
		//greet(); this wont work. i need an object first
		
		MethodIntro intro = new MethodIntro(); // i can use intro to call other objects
		
		
		intro.greet(); // intro will be bale to get greet
		
		System.out.println("--------------");
		
		intro.greet2("Abit"); // when i call this method it will print name at the end of the 
		//                      statements inside sysout
		System.out.println("--------------");
		intro.greet2("Ahmet"); // using same blueprint but giving different name 
		
		
		
		
		

	}

}
