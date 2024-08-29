package com.neotech.lesson19;

public class HomeWork01 {
	
	
		private	String word (String input)
	{
		
		String str = input.replaceAll("[^aeuioAEUIO]", " ");
		return str;
	}
	
	

	public static void main(String[] args) {
		/*
		  		Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
				Method should be available inside the class where it was declared and executed by calling it is name.
				
				class has to accept string
				has to be access only within a class which is private
				it must have return
		*/
		HomeWork01 task = new HomeWork01();
		
		
				
		String sen = "I missed Thursday night class and trying to catch up right now";
		
		String str1 = task.word(sen) ;
		System.out.println(str1);
		
		
		
	}

}
