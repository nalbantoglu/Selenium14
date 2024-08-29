package com.neotech.lesson18;

import java.util.Arrays;

public class HomeWork01 {

	public static void main(String[] args) {
		
//		
//		Create a String and print it in reverse order (Sunday → yadnuS). 
//	    Solve it using charAt(), toCharArray()  and reverse() methods.
//	    Note:
//	        for charAt() and toCharArray() use String
//	        for reverse you have to declare a StringBuffer object
//		
		
		
		
		String str = "Sunday";
		
		// charAT reverse
		
		System.out.println("charAt reversed");
		
		for (int i = str.length() - 1; i >= 0; i--)
		{
			char c = str.charAt(i); // get the character at the oindex i
			
			System.out.print(c);
		}
		System.out.println();
		
		System.out.println("==============");
		
		//2nd way use charArray
		// this method breaks the string into char array
		
		System.out.println("Using charArray");
		
		char [] arr = str.toCharArray();
		
		System.out.println("printin array " + Arrays.toString(arr));
		System.out.println("=============");
		
		System.out.println("Reversed using charAray");
		for (int i = arr.length - 1; i >= 0; i--)
		{
			char c = arr[i];
			System.out.print( c);
		}
		
		System.out.println();
		
		System.out.println();
		System.out.println("3rd way reversed method");
		
		
		
		StringBuffer strBuffer = new StringBuffer(str);
		
		System.out.println(strBuffer.reverse());
		
		System.out.println();
		
		System.out.println("Using String Builder");
		
		StringBuilder strBuilder = new StringBuilder(str);
		System.out.println(strBuilder.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
