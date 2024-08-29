package com.neotech.lesson05;

public class HomeWork1 {

	public static void main(String[] args) {

		/*
		 * Write a java program to check if a patient has allergies. If the patient does
		 * not have allergies print "You’re healthy!". If the patient has allergies,
		 * check if it is a peanut allergy, lactose allergy, bee allergy or seafood
		 * allergy and print a statement telling the patient "Don’t eat ___". (fill the
		 * line with the food names – peanut, seafood etc.)
		 * 
		 * 
		 */

		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = true;

		if (allergies) {
			System.out.println("you have allergie");

			if (peanut) {
				System.out.println("dont eat peanut");
			}
			if (lactose) {
				System.out.println("dont eat lactose");
			}
			if (bee) {
				System.out.println("dont mess with bees");
			}
			if (seafood) {
				System.out.println("dont eat seafood");
			}

		}

		else {
			System.out.println("you are health");
		}

	}

}
