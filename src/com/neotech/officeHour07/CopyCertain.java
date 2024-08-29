package com.neotech.officeHour07;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCertain {

	public static void main(String[] args) {

		/*
		 * 
		 * Finish the getWithE. Given a String array arr with the following elements
		 * 
		 * ["zero", "one", "two","three","four"]
		 * 
		 * Create another array fewValues and copy words that have letter e in them
		 * 
		 * You need to know how many element contain e and create array accordingly
		 * 
		 * Values in fewValues array need to be ["zero", "one","three"]
		 * 
		 * Examples:
		 * 
		 * arr -> ["aa", "be", "lol", "lel", "oreo"] fewValues -> ["be", "lel", "oreo"]
		 * arr -> ["e", "hey", "bye", "fury", "spoon"] fewValues ->["e", "hey", "bye"]
		 */
		
		String[] arr = {"aa", "be", "lol", "lel", "oreo"};

		System.out.println(Arrays.toString(getWithE(arr)));
		
	}
	
	
	
	public static String[] getWithE(String[] arr) {

		//count how many strings in the arr have the letter e?
		
		int size = 0;
		
		for (String str : arr)
		{
			if (str.contains("e"))
			{
				size++;
			}
		}
		
		
		String[] result = new String[size];

		int index = 0;
		
		for (String str : arr)
		{
			if (str.contains("e"))
			{
				result[index] = str;
				index++;
			}
		}
		
		
		
		//a simple trick
		
		String resultString = "";
		
		for (String str : arr)
		{
			if (str.contains("e"))
			{
				resultString = resultString + str +  "_";
			}
		}
		
		
	//	return resultString.split("_");
		return result;
	    
	  }
	
		}
		



		
		
		
		
		
		

