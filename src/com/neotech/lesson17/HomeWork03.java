package com.neotech.lesson17;

public class HomeWork03 {

	public static void main(String[] args) {
		
//		
//		//Create a String that should be combination of letters, numbers and special characters. 
//		Find out how many alpha characters are there in the String. 
//		(alpha characters means letters)
//		


		String replace = new String ("String that has combination of letters , numbers (12345) and special characters (? @ # $)");
		
		replace = replace.replaceAll("[^0-9a-zA-Z]", "");
		
		System.out.println("Removing special chararecter ----> " + replace);
		
		System.out.println("Alpha charecters in above sentence ----> " + replace.length());
		
		
		
	}

}
