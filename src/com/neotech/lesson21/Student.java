package com.neotech.lesson21;

public class Student {
	
	
	
	String name, address;
	
	
	// what is a constructor 
    // 1. special method which has the same name as the class 
	// 2. it does not have return type not even void.
	// 3. it can not be static
	// 4. we can pass parameters 
	// 5. we can use access modifier to decide who gets to access constructor
	
	
	// this is same as the default constructor java uses 
	Student()
	{
		System.out.println("Default constructor");
	}
	
	// this constructor takes one paratemeter and assign 
	// to the instance variable
	Student(String name)
	{
		this.name = name;
		
		//System.out.println(name);
	}
	
	// this constructor takes two parameters and assign 
	// values to the instance parameters
	Student(String name, String address)
	{
		this.name = name;
		this.address = address;
		
	}
	
	//Student(String address) can not have same signature 
	{
		
	}
	
	
	
	
	
   public void displayInfo()
	{
	   // using this.name is good practice to use it since it shows that 
		System.out.println("Name: " + this.name + "\nAddress: " + this.address);
	}
	
	
	

}
