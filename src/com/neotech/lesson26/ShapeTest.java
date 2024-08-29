package com.neotech.lesson26;

public class ShapeTest {

	public static void main(String[] args) {
		
		

		Circle c = new Circle();
		
		c.calculateArea(5);
		c.calculatePerimeter(5);	
		
		Square s = new Square();
		
		s.calculateArea(5);
		s.calculatePerimeter(5);
		
		System.out.println("---------------");
		
		
		Shape[] shapes = { new Square(), new Circle(), new Square(), new Circle()};
		
		
		for (Shape shape : shapes)
		{
			
			shape.calculateArea(10);
			shape.calculatePerimeter(10);
		}
		
	}

}
