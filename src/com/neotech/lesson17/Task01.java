package com.neotech.lesson17;

public class Task01 {

	public static void main(String[] args) {
//		You have a String str = "Is it saturday? Is it raining? Do we have a Java Class today?"
//		How would you find out how many sentences are in that String?
		
		
		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		
		
		String[] array = str.split("[?]"); // i have to use \\ or [] to be able to print ?
		// we can escape the first meaning of ? by using \\ or []
		
		System.out.println("The number of sentences is: " + array.length);
		System.out.println("===============");
		 
		// if wanted to print " Sabah" with double " "
		
		System.out.println("\"Sabah\" "); // i have to use escape character \
		System.out.println("===============");
		
		// how would you do it if you have different char
		
		String str2 = "It is  Thursday. Is it raining ?  We have a Java Class today!";
		
		String[] array2 = str2.split("[.?!]");
		
		
		// ,?! --> split when you find all of those exactly like that
		// [.?!] --> split when you see any of those 
		
		
		
		
		for( String s : array2)
		{
			System.out.println(s);
		}
		System.out.println("===============");
		
		System.out.println("the number of sentence is: " + array2.length); // getting number of sentences
		
		
		
		

	}

}
