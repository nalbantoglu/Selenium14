package com.neotech.lesson22;

public class A {

	
	//Homework 1:
	
       // Write program for multilevel inheritance 
	//where class A is inherited by B and class B is inherited by class by C.

	
	String name = "A";
	String LastName = "Test";
	
	void method()
	{
		System.out.println("This is a method in class A");
		System.out.println(this.name);
		
	}
	
	
}

class B extends A {
	
	
	String name = "B";
	
	void method()
	{
		System.out.println("This is a method in class B");
		System.out.println(name); // same as this.name 
		System.out.println(super.name);
		
		super.method();
	}

	
}

class C extends B{
	
	
	
    String name = "C";
	
	void method()
	{
		System.out.println("This is a method in class C");
		System.out.println(this.name); // same as this.name 
		System.out.println(super.name);
		
		System.out.println(super.LastName);
	
		
		super.method();
		
	}

	
	
	
	
	
	
	
	
}

