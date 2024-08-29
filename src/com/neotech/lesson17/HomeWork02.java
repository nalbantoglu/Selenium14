package com.neotech.lesson17;

public class HomeWork02 {

	public static void main(String[] args) {

		/*
		 * Write a program to print out the following conversion: Today is Tuesday and
		 * we have a Java Class!!! to yadoT si yadseuT dna ew evah a avaJ !!!ssalC. You
		 * can use any other string as long as the format is correct.
		 */

		
		
		String sentence = new String( "Attempting to reverse this sentence word by word");

		String[] result = sentence.split(" ");
		
		for (String word : result)
		{
			System.out.print( word + "-" );
		}
		
		System.out.println();
		
		char [] charArray = sentence.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--)
		{
			System.out.print(charArray[i]);
			
		}
		
		
		System.out.println();
        
        System.out.println(sentence);
        
        
        
       
        
        
        
		
		
		
		
		
	}

}
