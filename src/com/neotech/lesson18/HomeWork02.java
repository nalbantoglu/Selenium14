package com.neotech.lesson18;

import java.util.Arrays;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * Homework 2: Write a program to print out the following conversion: 
		 * Today isTuesday and we have a Java Class!!! 
		 * to --- > yadoT si yadseuT dna ew evah a avaJ !!!ssalC. 
		 * You can use any other string as long as the format is correct.
		 * 
		 */

		         String sentence = "Today is Tuesday and we have a Java Class!!!";
		         
		         // splitting sentence in string arrays using split method
		         String[] words = sentence.split(" ");
		         
		 System.out.println(Arrays.toString(words));
		 
		 System.out.println();
		 
		 System.out.println("Now reversing ");
		 
		 HomeWork02 hw2 = new HomeWork02();
		 
		 
		 for (String word : words)
		 {
			 
			 
		//	StringBuffer strBuffer = new StringBuffer(word);
		//	System.out.print(strBuffer.reverse() + " ");
			 
			 
			 
			 // "2nd way of doing it by building my orn method " + 
			 System.out.print(hw2.reverseString(word)+ " ");
			 
			 
		 }
		 System.out.println();
		 
		 //2nd way of doing it 
		 
		 
		 
		
		 
	}



          String reverseString(String input)
          {
        	  char[] charArray = input.toCharArray();
        	  String reversedStr = "";
        	  
        	  for (int i = charArray.length -1 ; i>=0 ; i-- )
        	  {
        		  reversedStr += charArray[i];
        		  
        	  }
        	  return reversedStr; 
          }

          }









