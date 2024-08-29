package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
	

		
     
		String str = "Hello";// create a string hello ==> create a string object pointing to it 
		
		str.concat("World"); // got the hello added world ---> created new string
		
		System.out.println(str); // str did not change
		
		str.toUpperCase(); // did this change the str?
		// we created a new string "HELLO"
		
		// str was pointing this string
		// now i am just saying that str points new string str.concat
		
		str = str.concat("World");
		System.out.println(str);
		
		
		
		// am i creating nee string??
		// i am creating new object 
		String srt2 = "Hello"; // i am creating new string object str but it will point 
		// to the existing "Hello" that i created above
		
		
		
		
		
		
		
		
	}

}
