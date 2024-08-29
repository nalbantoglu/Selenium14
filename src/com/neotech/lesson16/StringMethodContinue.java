package com.neotech.lesson16;

import java.util.Scanner;

public class StringMethodContinue {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		// Contains ()
		
		String sentence = "Hope is what you live for!";
		boolean response = sentence.contains("Hope");
		
		
		
		
		
		
		
		
		
		// same as saying --> does this string sentence contain this element yes / no (true or false
		System.err.println(response);
		
		
		//checking ignore case
		
		System.out.println(sentence.toLowerCase().concat("hope")) ; 
		
		// i could do this in two line
		
		String lower = sentence.toLowerCase();
		boolean check = lower.contains("hope");
		
		
		// equals()
		String s1 = "Tuesday";
		String s2 = "tuesday";
		
		boolean equals = s1.equals(s2);
		System.out.println("---> " +equals);
		
		
		// ignore case
		boolean equals2 = s1.equalsIgnoreCase(s2);
		System.out.println(equals2);
		
		
		// instead of equal ignore case() i could do this
		
		boolean equalUsingLower = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println("converting to lower case first --> " + equalUsingLower);
		
		
		
		boolean starts = sentence.startsWith("Hope");
		System.out.println("Does is starts wilt hope--> " + starts);
		
		
		
		
		boolean ends = sentence.endsWith("for!");
		System.out.println("Does is ends wilt for--> " + starts);
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
