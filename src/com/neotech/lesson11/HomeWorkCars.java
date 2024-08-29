package com.neotech.lesson11;

public class HomeWorkCars {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. 
		//Print all values from the array.
		
		
		String [] cars = new String[6];
		
		cars[0]= "Tesla";
		cars[1]= "BMW";
		cars[2]= "Mazda";
		cars[3]= "Kia";
		cars[4]= "Honda";
		cars[5]= "Subaru";
		
		int size = cars.length;

		for (int i = 0; i < size;i++)
		{
			System.out.println(cars[i]);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
