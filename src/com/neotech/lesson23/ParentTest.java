package com.neotech.lesson23;

public class ParentTest {

	public static void main(String[] args) {
		

		Parent p = new Parent();
		
	//	p.hello(); private can not access from here
		
		p.bye();
		
		System.out.println("------------");

		
		Child c = new Child();
		
	// 	c.hello(); not acceasible from here
		
		c.bye();
	}

}
