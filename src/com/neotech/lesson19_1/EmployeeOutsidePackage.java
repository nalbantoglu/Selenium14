package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {
	
	public static void main(String[] args) {

		Employee.company = "Neotech";
		
		Employee emp = new Employee();
		emp.name = "Sufiyan";
//		emp.lastName = ""; //protected, not visible from outside the package
//		emp.salary = 150000; //default, so we cannot see it from here
//		emp.ssn = 1234; //this is private, we can only access it from the same class
		
		
		
		emp.method1(); //accessible because its public
		
		//these methods exist, but they cannot be accessed from outside of the package 19
	//	emp.method2();
	//	emp.method3();
	//	emp.method4();
		
    //		emp.method5(); //this is completely different problem. this method is undefined
	}

}
