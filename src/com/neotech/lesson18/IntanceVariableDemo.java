package com.neotech.lesson18;

public class IntanceVariableDemo {

	public static void main(String[] args) {
		
		IntanceVariables iv1 = new IntanceVariables();
		
		
		System.out.println(iv1.name);
		
		// we dont have to assign an initial value to create an intance

		
		IntanceVariables iv2 = new IntanceVariables();
		iv2.name = "Jennifer";
		System.out.println(iv2.name);
		
		IntanceVariables iv3 = new IntanceVariables();
		System.out.println(iv3.name);
		
		
	
	
	}

}
