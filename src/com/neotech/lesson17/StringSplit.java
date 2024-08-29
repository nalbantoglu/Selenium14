package com.neotech.lesson17;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		
		
		
		//split()
		
				String sentence = "Today is Thursday and we're learning JAVA!!!";
				
				
				String[] result = sentence.split(" ");
				
				for (String word : result)
				{
					System.out.print( word + "-" );
				}
				System.out.println();
				
				System.out.println("The sentence has " + result.length + " words!");
				
				System.out.println("==============");

				String[] array = sentence.split("y"); // when i use split it becomes string array
				
				System.out.println("==============");
				
				for (int i = 0; i < array.length; i++)
				{
					System.out.print(array[i] + "*");
				}
				System.out.println();
				
				
				//we can use regex as a split criteria
				
				String list = "1Fasry2Iana3Mona4Emrah";
					
				System.out.println("==============");
				
				String[] names = list.split("[0-9]");//[1234], [1-4], \d
				
				
				for (String name : names)
				{
					System.out.print(name + " "); //a tab space
				}
				System.out.println();
				
				System.out.println("==============");
				
				//can I print an array directly?
				
				
				//Arrays is a array utility class
				System.out.println(Arrays.toString(names));
	}

}
