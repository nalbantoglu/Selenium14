package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingExceptions {

	public static void main(String[] args) {

		String path = "";
		
		try {
			FileInputStream fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
		
		//	e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("FileNotFoundException caught!!!");
		}
		
		
		
	
		int a = 5;
		int b = 0; 
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException caught!!!");
		}
	
	System.out.println("End of code!");
	
	
	//there are two ways to handle exceptions: 
		//1. we could say add throws declaration on the method that includes them
		// - you are passing the responsibility to whoever uses the method
		//2. handle it properly with try and catch
	
	}

}
