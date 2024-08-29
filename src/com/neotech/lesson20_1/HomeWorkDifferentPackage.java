package com.neotech.lesson20_1;

import com.neotech.lesson20.HomeWork02Employee;

public class HomeWorkDifferentPackage {

	public static void main(String[] args) {
		
		
		// Accessing HomeWork class from this class 
		
				HomeWork02Employee emp = new HomeWork02Employee();
				

				System.out.println("Accessing varibales within the different package");
				System.out.println();
				
				System.out.println("public -- > "+ emp.company);
				System.out.println();
				
				// unable to access this outside of the package
	
			//	System.out.println("default -- > "+ emp.name);
				System.out.println();
				
				// unable to access this outside of the package
			//	System.out.println("protected ---> " + emp.lastName);
				System.out.println();
				
				//System.out.println("private ---> " + emp.ssn); unable to access this 
				// outisde of the class
				

	}

}
