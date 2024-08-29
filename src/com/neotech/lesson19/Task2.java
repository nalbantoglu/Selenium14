package com.neotech.lesson19;

public class Task2 {
	
	/*
	 Create a method that will take a String as a parameter and returns reversed String. 
	 Method should be available to all classes within your project and accessible by class 
	 name.
	 Call this method from inside the same class and from a class in another package. 
	 
	 */
	
	
	//Hints on the text: 
		// Input: String
		// Functionality: reverse the String
		// Output: String
	
	
	// available to all classes within your project ---> public
	// accessible by class name  --> static
	
	
	
	//now that we have the body of the method, lets talk about functionality
	
	
	//Logic 1:
		//start with an empty string
		//loop all of the letters of the str starting from the end, and add them to the string
	
	
	//is this a good way????
	public static String reverse(String str)
	{
		//Str = "Sabah"
		//Step 1: h
		//Step 2: ha
		//Step 3: hab
		
		
		String reversed = "";
		
		for (int i = str.length()-1; i >=0 ; i--)
		{
			reversed += str.charAt(i);
		}
		
		return reversed;
	}
	
	
	//Logic 2: 
		//We know we can reverse a string with StringBuffer or StringBuilder
		//1. Create a stringBuffer object using str
		//2. call the reverse method
		//3. Reverse method with return a StringBuffer object, so just use .toString()
	public static String reverse2(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		String reversedStr = sb.reverse().toString();
		
		return reversedStr;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		String day = "Thursday";
		
		System.out.println(reverse(day));
		System.out.println(reverse2(day));
		
	}
	
	

}
