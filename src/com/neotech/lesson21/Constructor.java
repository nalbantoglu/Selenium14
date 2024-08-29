package com.neotech.lesson21;

public class Constructor {
	
	
	
	Constructor()  // calls the default Constructor
	{
		this(5);
		System.out.println("Default Constructor");
	}
	
	//2nd Constructor
	Constructor(int x)
	{
		this(5,10);
		System.out.println("SEcond Constructor");
		
	}
	
	// 3rd Constructor
	Constructor(int x, int y)
	{
		System.out.println("third Constructor");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

		Constructor cs1 = new Constructor();
		
		Constructor cs2 = new Constructor(5);

	}

}
