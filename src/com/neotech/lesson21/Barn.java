package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
		

		Animal a = new Animal();
		
		a.name = "Leo";
		a.color = "Gray";
		a.age = 3;
		a.weight = 25;
		// a.breed = ""? animal does not have a this future
				
		a.eat();
		a.sleep();
		a.displayInfo();
// 	a.bark(); not all animal bark
		
		
		
		System.out.println("------------------");
		
		Dog d = new Dog();
		
	    d.name = "Daisy";
	    d.color = "Brown";
	    d.age = 2;
	    d.weight = 20;
	    
	    d.breed = "Golden";
	
		d.eat();
		d.sleep();
		d.displayInfo();
		
		// behavior of the dog / child
		d.bark();

		System.out.println("------------------");
		
		Cat c = new Cat ();
		
		// all these futures are inherited from animal class
		c.name = "Fluffy";
		c.color = "Brown";
		c.age = 2;
		c.weight = 10;
		
		// c.breed =  not able to access dog features or behaviors
		
		c.eat();
		c.sleep();
		c.displayInfo();
		
		c.meow();
		
		System.out.println("------------------");
		
		Puppy p = new Puppy();
		
		
		// all features and behaviors from animal class 
		// Everything from dog class
		// everything that exist in puppy class
		
		p.age = 1;
		p.breed = "Husky";
		p.hasTrainer = true;
		
		p.displayInfo();
		
		
		
		
		
		
		
		
		
		
	}

}
