package com.neotech.lesson23;

public class Shape {
	
	/*
	 * Homework 5:
    Write program: Shape class has a constructor that takes
    the radius and has a subclass as Circle class. 
    In Circle class create a method to calculate the area of circle. Test
    your code
*/
	
	int radius;
	
	Shape(int radius )
	{
		this.radius = radius;
		
	}

	
}

class Circle extends Shape{
	
	/*
	Circle ()
	{
		// this is by default calls super
		
		// i can let the user create an object of their class without passing a radius
		// radius , so i pass default radius
		super(5);
	}
	*/
	
	
	Circle(int radius)
	
	{
	
	super(radius);
	
	}
	
	 void calculateArea ()
	 {
		 System.out.println("The area of the circle is: " + Math.PI * radius * radius);
	 }
	
	
}
