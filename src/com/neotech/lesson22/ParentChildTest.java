package com.neotech.lesson22;

public class ParentChildTest {

	public static void main(String[] args) {
		
		
		
		Child c = new Child();
		
		c.display();
		System.out.println();
		c.sayHello();
		
		// which method is calling?
		c.hello(); // calling child class

		
	}

}
