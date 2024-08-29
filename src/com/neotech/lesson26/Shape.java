package com.neotech.lesson26;

public interface Shape {
	
	/*
	 * Create an Interface 'Shape' with undefined methods as calculateArea and 
	 * calculatePerimeter. 
	 * Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
	 * Test your code.
	 */
	
	//Do I have to add public abstract???
	// NO, I DON'T. In an Interface all methods are public abstract by default
	
	void calculateArea(int r);
	
	void calculatePerimeter (int r);
	
}

class Circle implements Shape{

	@Override
	public void calculateArea(int r)
	{
	
			System.out.println("The area of the circle is " + Math.PI * r * r);
		
	}

	@Override
	public void calculatePerimeter(int r)
	{
	
		System.out.println("The perimeter of the circle is " + 2 * Math.PI * r);

	}
	
	
	
	
	
	
}



class Square implements Shape{

	@Override
	public void calculateArea(int r) {
		System.out.println("The area of the square is " + r * r);
		
	}

	@Override
	public void calculatePerimeter(int r) {
		
		System.out.println("The perimeter of the square is " + 4 * r);
		
	}
	
     
	
	
}