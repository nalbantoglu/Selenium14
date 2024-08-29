package com.neotech.lesson22;

public class Parent {

	
	String name = "Parent name";
	String lastName = "Parent lastName";
	
	void hello()
	{
		System.out.println("I am the parent class!");
	}
	
	
	
}

class Child extends Parent
{
	
	String name = "Child name";
    
	
	void hello()
	{
		System.out.println("I am the Child class!");
	}
	
	void display()
	{
		System.out.println(name); // which name is printing  // child name - java automatically adds this. in front of it 
		
		System.out.println(this.name); // i am specifying this name in child class
		
		System.out.println(super.name); // super refers to parent class
		
		System.out.println(lastName); // parent last name inherited from parent class
		
		System.out.println(super.lastName); // no need to use super. parent last name inharited from parent class
		
		System.out.println(this.lastName); // Referring to parent last name 
		
		
	}
	
	void sayHello()
	{
		display(); // java automatically adds this. front of it 
		hello();  // java automatically adds this. front of it 
		super.hello(); // referring to parent class hello 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}















