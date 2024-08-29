package com.neotech.lesson23;

public class ShapeTest {

	public static void main(String[] args) {
		

		Shape s =  new Shape(5);
		
	//	s.calculateArea(); parent can not inherit from child class
		
//		Circle c = new Circle();
//		c.calculateArea();
//		the creator of the class is not allowing a default constructor
		
		Circle c = new Circle(5);
		c.calculateArea();

	}

}
