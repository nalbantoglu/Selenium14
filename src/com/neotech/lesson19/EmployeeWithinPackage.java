package com.neotech.lesson19;

public class EmployeeWithinPackage {
	
public static void main(String[] args) {
		
		Employee.company = "Neotech";

		Employee emp = new Employee();
		
		emp.name = "Sinem";
		emp.lastName = "Tok";
		emp.salary = 150000;
    //	emp.ssn = 12345;  //the field is NOT VISIBLE because is it private ---- it can only be access within the same package
		
//		emp.phoneNumber = 12345; //this is different, it does not exist
		
		
		//for variables --> within the same package we can see all, EXCEPT private elements
		
		//can we access the methods
		
		emp.method1();
		emp.method2();
		emp.method3();
	//	emp.method4(); //the error says its there, but you do not have access to it from here (private)
//		emp.method5(); //the error says the method does not exist
		
		
	}

}
