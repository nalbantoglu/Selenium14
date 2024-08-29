package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {
		

		// hoe did we create a string
		
		String a = "Hello";
		String b = new String("Hello"); //using new keyword
		
		// mutable String classess
		//StringBuffer
		//StringBuilder
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		
		a.concat(" All");
		System.out.println(a);
		
		
		// i can change a string buffer object without creating new one
		sb.append(" All!");    // append means attach to end of it
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		
		String substr = sb.substring(2, 7);
		System.out.println(substr);
		
		System.out.println("============");
		
		//StringBuilder example
		StringBuffer strBuffer = new StringBuffer("some string her");
		
		StringBuilder strBuild = new StringBuilder("Some String here");
		
		strBuild.append(" some more text");
		
		System.out.println(strBuild);
		
		
		
		
		
		
		
	}

}
