package com.neotech.lesson16;

public class StringMethodMore {

	public static void main(String[] args) {
		
		
		
		
		String  name = "Emrah";
		
	    char letter = 	name.charAt(0); // gets letter from the name
		System.out.println("Letter : " + letter);
		
		
		// index of   and last indexof 
		
		int index =       name.indexOf('m');
		
		// what does it return if the letter is not on the string---- it will return -1
		System.out.println("the index of the letter M is :" + index);
		
		
		String name1 = "Sabah";
		System.out.println("the index of the a is: " + name1.indexOf('a') + " and " + name1.lastIndexOf('a'));
		System.out.println("the last index of the a is: " + name1.lastIndexOf('a'));
		
		
		System.out.println("the index of the ab is: " + name1.indexOf("ab"));
		
		
		String message = "Today is raining";
		// this only takes 1 parameter : startign index
		// then is returns the string from the starting index to the end of teh string
		String substr = message.substring(9); // this will start at index 9 and go till the end
		System.out.println("index 9--> "+ substr);
		
		String substr2 = message.substring(6,8); // this will get the substring starting at index 6 and ending at index 8-1
		System.out.println("index between 6 and 8---> " + substr2);
		
		// how can i get Today from this string 
		String substr3 = message.substring(0, 5);
		System.out.println("getting today --->: " + substr3);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
