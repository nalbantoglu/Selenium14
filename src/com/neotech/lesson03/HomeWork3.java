package com.neotech.lesson03;

public class HomeWork3 {

	public static void main(String[] args) {
	
		
		/* 1. Write a java program to display the area and perimeter
         of a circle that has a radius of 5. Use pi = 3. 

        2. Write a java program that converts mile to km and km to miles.
        Use scale 1 mile = 1.609344.
        Print the conversion on the console.
        For example: 10 miles is 16.09344 kilometers
		 * 
		 *  
		 */
		
		
		//Area = pi × radius x radius ;
		//Perimeter = 2 × pi × radius
		
		int area, peri, pi, radius;
		pi = 3;
		radius = 5;
		
		
		
		area = pi * radius * radius; 
		System.out.println("Are of the circle is---> " + area);
		
		peri = 2 * pi * radius;
		System.out.println("Perimeter of the circle is---> " + peri);
		
		

	System.out.println("-----------------");
		
	   //2. 
	double km, mile;
	
	km = 223;
	mile = 180;
	
	double res = 223/1.609344;
	System.out.println("223km is " + res + " miles");
	
	double res2 = 180 * 1.609344;
	System.out.println("180miles is " + res2 + " km");
		
		
	}

}
