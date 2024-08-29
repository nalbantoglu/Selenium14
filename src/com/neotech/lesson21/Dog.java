package com.neotech.lesson21;

public class Dog extends Animal {
// using extends we get all attributes and behavior 
	//of the animal class
	
	
	String breed;
	
	// dog specific behavior
	public void bark()
	{
		System.out.println("only dog barks");
		System.out.println("The breed is: " + breed);
		System.out.println("The name is: " +name );
	}

}
