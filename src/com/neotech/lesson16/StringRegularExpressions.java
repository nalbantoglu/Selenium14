package com.neotech.lesson16;

public class StringRegularExpressions {

	public static void main(String[] args) {
		

		
		String greeting = "Good Evening";
		// how to replace letters
		// use replace()
		
		String newGrereting = greeting.replace('e', 'E');
		
		//System.out.println(greeting);
		System.out.println(newGrereting);
		
		String anotherGreeting = greeting.replace("Evening", "Afternoon");
		System.out.println(anotherGreeting);
		
		
		// if i wanna to replace G --> g E--e
		
		String replceMultiple = greeting.replace('G', 'g').replace('E', 'e');
		
		System.out.println(replceMultiple);
		
		System.out.println("-----------------");
		
		// regular expressions
		String combination = "My phone # is: 345-678-1010";
		
		String combination2 = combination.replaceAll("[0-9]", "*"); // replacing everything from 0 to 9
		
		
		System.out.println(combination2);
		System.out.println("-----------------");
		
		
		String combination3 = combination.replaceAll("[a-z]" , "+");
		
		System.out.println(combination3);
		System.out.println("-----------------");
			
		
		String combination5 = combination.replaceAll("[a-zA-Z]" , "+");
		
		System.out.println(combination5);
		
		System.out.println("-----------------");
		
		
       // covert to opposite of the expression
		// [0-9] replace alls numbers 0-9
		// [^0-9] replace all except 0-9
		String combination6 = combination.replaceAll("[^0-9]" , ""); // replacing everything but numbers
		
		System.out.println(combination6);
		
		System.out.println("-----------------");

		String combination7 = combination.replaceAll("[0-9a-zA-Z]" , "=");
		
		System.out.println(combination7);
		System.out.println("-----------------");
		
         String combination8 = combination.replaceAll("[^0-9a-zA-Z]" , "");
		
		System.out.println(combination8);
		System.out.println("-----------------");
		 
		
		
		
		

	}

}
