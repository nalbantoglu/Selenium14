package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {
		

		Animal animal = new Animal();
		
		animal.eat();
		animal.sleep();
		animal.sleep();
		//animal.run(); only on child class
		
		System.out.println("---------");
		
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.sleep();
		tiger.run();
		

		System.out.println("---------");
		
		// casting with object
		
		  // what does this line here 
		
	//	new Tiger(); // creates new tiger object
		
		
	//	Tiger tiger;  --> tiger object
		
		
		// create tiger object assigning it to animal object
		// up casting
		Animal a = new Tiger ();
		// a is of animal type buy has tiger object assign to it
		
		a.eat();
		a.sleep();
		
	  //	a.run(); it is compiler error -- object a is of animal type, 
		//it can only see what it declared on animal class 
		
		
		
		// when casting tiger as an animal object we are able to 
		// access all methods of the animal class
		// but if we have an overriding method in the tiger class
		// that takes priority on run time

		
		/* 
		 * can we downcast
		 * yes we can but we have to be careful
		 * 
		 * Tiger t = (tiger) new Animal();
		 * 
		 * 
		 * 
		 * it is safe to down cast upcasted object
		 * 
		 * 
		 * a is animal type, but i can downcast it to a tiger
		 * 
		 * 
		 */
		System.out.println("-------------");
		
		Tiger t = (Tiger) a;
		
		t.eat();
		t.sleep();
		t.run();
		
		
		
	}

}
