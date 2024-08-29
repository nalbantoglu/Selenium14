package com.neotech.lesson23;

public class Animal {
	
	public void eat()
	{
		System.out.println("All animals eat");
	}
	
	public void sleep()
	{
		System.out.println("All animals sleep");
	}


	// compile time polymorhphism -- method overloding 
	
	public void sleep(String str)
	{
		System.out.println("All animals eat");
	}
}


class Tiger extends Animal{
	
	public void eat()
	{
		System.out.println("Tiger eats humans");
	}
	
	public void run()
	{
		System.out.println("Tiger runs very fast");
	}
}
