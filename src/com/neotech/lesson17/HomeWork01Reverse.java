package com.neotech.lesson17;

public class HomeWork01Reverse {

	public static void main(String[] args) {
		
//		Homework 1:
//		    Create a String and print it in reverse order (Sunday → yadnuS). 
//		    Solve it using charAt(), toCharArray()  and reverse() methods.
//		    Note:
		
//		        for charAt() and toCharArray() use String
//		        for reverse you have to declare a StringBuffer object


		
		String a = "Sunday ";
		
		StringBuffer reverse = new StringBuffer("Sunday ");
		
		System.out.println("Sunday in reverse method ----> " + reverse.reverse());
		
		System.out.println("==========");
		
		
		
		
		
		
		System.out.print("Sunday in char array ----> ");
		char[] array = a.toCharArray();
		
		for (char c : array)
		{
			//System.out.print(c);
		}
		
		for (int i = array.length-1; i >= 0; i--)
		
		{
			System.out.print(array[i]);
		}
		
		System.out.println();
		
		
		
		System.out.println("==========");
		
	
		
		

		
		System.out.print("Sunday in charAt ----> ");	
		for (int i = a.length() -1 ; i >= 0; i--)
			
		{
			System.out.print(a.charAt(i));
		}
		
		
		
		
	}

}
