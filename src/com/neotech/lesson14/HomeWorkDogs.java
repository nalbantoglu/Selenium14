package com.neotech.lesson14;

public class HomeWorkDogs {

	public static void main(String[] args) {
		
		
		
		
		Dog02 d1 = new Dog02();
		
		d1.breed = "Husky";
		d1.size = "medium";
		d1.age = 2;
		d1.color = "Black and white";
		
		System.out.println(d1.breed + " is " + d1.size + " in size, age of " + d1.age + " and " + d1.color + " color");
		
		d1.cold();
		d1.sled();

		System.out.println();
		
        Dog02 d2 = new Dog02();
		
		d2.breed = "Bulldog";
		d2.size = "Small";
		d2.age = 1;
		d2.color = "Brown";
		
		System.out.println(d2.breed + " is " + d2.size + " in size, age of " + d2.age + " and " + d2.color + " color");
		d2.breed();
		
		System.out.println();
		
       Dog02 d3 = new Dog02();
		
		d3.breed = "Labrador";
		d3.size = "medium";
		d3.age = 3;
		d3.color = "Golden";
		
		System.out.println(d3.breed + " is " + d3.size + " in size, age of " + d3.age + " and " + d3.color + " color");
		 d3.run();
		 
	}

}
