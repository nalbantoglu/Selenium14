package com.neotech.lesson20;

public class CarDemo {
	
	

	public static void main(String[] args) {
		

		/*
		Car c1 = new Car();
		
		c1.brand = " Tesla ";
		c1.color= " Blue ";
		c1.mile = 3245.8;
		
		c1.printDetails();
		*/
		
		System.out.println();
		
		// create new car object using construtor method
		
	System.out.println("Using construtor to print car information");

		Car c2 = new Car("Tesla","Blue",3245.8);
		
		c2.printDetails();
		
		System.out.println();
		
		
		
		
		

	}

}
