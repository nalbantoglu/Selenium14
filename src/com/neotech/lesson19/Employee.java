package com.neotech.lesson19;

public class Employee {
	
	
	// Access modifiers -- 4 of them 
	// public       everyone can access
	// protected    
	// default  
	// private   most restricted
	
	
	public static String company;  // everyone can see company name 
	
	public String name;
	
	protected String lastName; 
	
	double salary;  // if no access modifier is provided the we way its default
	
	private int ssn; // no one can use or see and no access
	
	// formula 
	//     OPTIONAL           MUST               MUST          OPTIONAL       OPTIONAL
	// Access modifier    data type -----   variable name          =           value
	
	
	
	
	// methods with different access modifiers 
	
	public void method1()
	{
		System.out.println("I am public method");
	}
	
	protected void method2()
	{
		System.err.println("I am a protected method");
	}
	
	void method3()   // this is default access modifier
	{
		System.out.println("I am a default method");
	}
	
	private void method4()
	{
		System.out.println("I am a PRIVATE method!");
	}
	
	
	
	// accessing methods with in the same class 
	
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		
		company = "NeoTech";
		emp.name = "Tima";
		emp.lastName = "Fakoly";
		emp.salary = 150000;
		emp.ssn = 123456;
		
		
		// let us try methods 
		
		emp.method1();
		emp.method2();
		emp.method3();
		emp.method4();
		
		
		
		
		
		
		
	}
	
	

}
