package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {
		

		
		Cat cat1 = new Cat();
		
		cat1.name = "Fluffy";
		cat1.weight = 15;
		cat1.color = "Brown";
		
		
		cat1.sayMeow();
		cat1.displayCatInfo();

		System.out.println();
		
        Cat cat2 = new Cat();
		
		cat2.name = "Tizir";
		cat2.weight = 9;
		cat2.color = "Gray";
		
		cat2.displayCatInfo();
		
		System.out.println();
		
		System.out.println(cat1.name + " is " + cat1.color);
		System.out.println(cat2.name + " is " + cat2.color);
		
		
		System.out.println();
		
		cat1.name = "Garfield"; // reassigning cat1 name
		System.out.println(cat1.name);
		System.out.println(cat1.name + " is " + cat1.color);
		
		System.out.println();
		
		
		cat1.displayCatInfo(); // cat1 information changed
		cat2.displayCatInfo();
		
		
		
		Dog dog5 = new Dog();
		
		dog5.displayDogInfo();
		
		
		
		
		
		
		
		
		
		
		
	}

}
