package com.neotech.lesson24;

public class Computer {
	
	/*
	Homework: 
	    ▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
	    
	    ▪ Define some common behavior (methods) and some fields in the parent class, and override some of the methods in the child classes.
	    ▪ Define some methods specific to the child classes.
	    ▪ Create objects of the child classes and store them in an array.
	    ▪ Loop through each object and execute available methods.
*/
	
	String brand;
	

	public Computer(String brand)
	{
		this.brand = brand;
	}
	
	public void run()
	{
		System.out.println(brand + " can run the system");
	}
	
	
}      

class Apple extends Computer{
	
	

	public Apple(String brand) {
		
		super(brand);
		
	}
	@Override  // overriding the super class 
	public void run()
	{
		System.out.println(brand + " runs the system FASTER!");
	}
	
	public void safe()
	{
		System.out.println(brand + " is very safe");
	}
	
	
}

class Lenovo extends Computer{

	public Lenovo(String brand) {
		super(brand);
		

	}

	@Override
	public void run() 
	{
		System.out.println(brand + " computers run fast");
	}
	
	public void save()
	{
		System.out.println(brand + " has a lot of memory");
	}

}

class HP extends Computer{

	String color;
	
	 HP(String brand, String color) {
		super(brand);
		this.color = color;
		

	}
	 public void run()
	 {
		 System.out.println(brand + " runs slow");
	 }
	public void save()
	{
		System.out.println(brand + " does not have a lot of memory");
	}
	
}

class Dell extends Computer{

	public Dell(String brand) {
		super(brand);
		

	}
	
	
	
	
	
	
	
}


















