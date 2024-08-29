package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		System.out.println("hello" + " " + "World");
		
		
		String language = "python";
		
		System.out.println("I love java");
		System.out.println("i love " + language);
		
		String s1 = "i love";
		String s2 = "programing";
		
		System.out.println(s1 + " " +language + " " + s2);
		
		
		
		// string + number = becames string 
		String s3 = "i am " + 2;
		System.out.println(s3);
		
		String s4 = s3 + 5;
		System.out.println(s4);
		
		
		// order of operation in a String
		System.out.println("i have " + 2 + 2 + " cats" ); // adding numbers to string makes it string  
		
		System.out.println("i have " + (2+2) + " cats"); //numbers in ( ) does not changes the value
		
		
		
		
	}

}
