package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
	
		
		// create arrays of names
		
		String[] names = new String[5]; // defined the size, values are null by default
		
		names [0] = "abit";
		names [1] = "nazli";
		names [2] = "emin";
		names [3] = "maya";
		names [4] = "khen";
		
		
		int arrayLength = names.length; // this is the way to find the size of the Strings array . i have to use int if i need to find size of string array
		System.out.println(arrayLength);
		
		int[] scores = {90, 95, 85, 76, 85, 65};  // declaring and assigning at the same time
		System.out.println(scores.length);
		
	}

}
