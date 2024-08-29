package com.neotech.lesson03;

public class Task02 {

	public static void main(String[] args) {
		
		
//		 Write a program to print the area and perimeter of a rectangle with 
//		 width = 5 and height = 8. Your program should say. "
		//The perimeter of a rectangle with width ___ and height ___ is equal to ___ and the area is ___"
//		 
		
		//Area = width * height
//		 Perimeter = 2 * (width + height)
//		
		
		
		
		
		
		//declaring the values
		int w, h, p, a;
		
		w = 5;
				
	    h = 8;
		
		
		 p = 2*(w+h); 
		 System.out.println("perimeter--> "+ p);
		 
		 a = w*h;
		 System.out.println("area --> " + a);
		
	
		
		System.out.println(a + p);
		
		System.out.println("The perimeter of a rectangle with width " + w + " and height " + h + " is equal to " + p + " and the area is " + a);

	}

}
