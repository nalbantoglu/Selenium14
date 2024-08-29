package com.neotech.lesson06;

public class LogicalOR {

	public static void main(String[] args) {
		
		

		boolean hasAllergy = false;
		boolean peanut = false;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = false;
		
		
		//if statement is false everything else would be false 
		//because on && operator all the condition has to be true 
		
		
		
		
		if (hasAllergy && peanut || lactose || bee || seafood)
		{
			System.out.println("you are allergic to something");
		}
		
		else 
		{
			System.out.println("no allergies");
		}

	}

}
