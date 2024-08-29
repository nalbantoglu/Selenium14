package com.neotech.lesson20;

public class HomeWorkDifferentClass {

	public static void main(String[] args) {
		

		
		
		// Accessing HomeWork class from this class 
		
		HomeWork02Employee emp = new HomeWork02Employee();
		

		System.out.println("Accessing varibales within the different class");
		System.out.println();
		
		System.out.println("public -- > "+ emp.company);
		System.out.println();
		
		System.out.println("default -- > "+ emp.name);
		System.out.println();
		
		System.out.println("protected ---> " + emp.lastName);
		System.out.println();
		
		//System.out.println("private ---> " + emp.ssn); unable to access this 
		// outisde of the class
		
		
		

	}

}
