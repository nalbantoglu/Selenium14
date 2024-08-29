package com.neotech.lesson17;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		

		//toCharArray()
		
				String sentence = "Today is Thursday and we're learning JAVA!!!";
				
				char[] charArray = sentence.toCharArray();

				for (char c: charArray)
				{
					System.out.print(c + "|");
				}
				System.out.println();
				
				System.out.println("============");
				
				System.out.println(Arrays.toString(charArray));
				
				System.out.println("============");
				
				
				System.out.println("The sentence length is: " + sentence.length());
				System.out.println("============");
				System.out.println("The array length is: " + charArray.length);
				
				System.out.println("============");
				
				
				System.out.println("Reversing sentemnce");
				
				for (int i = charArray.length-1; i >= 0; i--)
				{
					System.out.print(charArray[i]);
				}
				
	}

}
