package com.neotech.lesson23;

public class Parent {
	
	
	Parent()
	{
		System.out.println("Parent class constructor");
	}
	
	
	// This can not be override
	private void hello()
	
	{
		System.out.println("hello from parent class");
	}
	
	static void bye()
	{
		System.out.println("Bye from parent class");
	}

	
	
}

class Child extends Parent{
	
	Child()
	{
		System.out.println("child class constructor");
	}
	
	// we are not overriding we do not have access to private method of the parent class, we are just creating another method
	private void hello()
	{
		System.out.println("Hello from child class");
	}
	
	// we are re declaring a static method in this class but not overriding it from parent class
	// static belongs to the class can not be inharited 
	static void bye()
	{
		System.out.println("Bye from child class");
	}
	
}







