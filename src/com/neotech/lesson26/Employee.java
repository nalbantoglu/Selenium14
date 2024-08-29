package com.neotech.lesson26;

public class Employee {
	
	private	String name;
	
	private	int age;
	
	private	double salary;
	
	// we put variables as private which mean i can only access 
	// from within the class
	
	
	// i can allow control access 
	
	// there can be two situations 
	// someone needs to GET the value of the paremeter 
	  // we will create GETTER
	
	// someone needs to SET the value of the parameter
	   //  we will create SETTER

	
	// but it is not requered
	
	
	
	public String getName()
	{
		return name;
		
	}
	
	// getter for age
	
	public int getAge()
	{
		return age;
	}
	
	// setter for salarry 
	
	public double getSalary() {
		return salary;
	}
	
	
	
	
	
	// setter for name
	public void  setName(String name)
	{
		// i want to allow this only if the string set is not empty
		// and is atleast two character
		
		if (!name.isEmpty() && name.length() >=2)
		{
		    this.name = name;
		
		}	
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	// setter for lalarry 
	
	public void setSalary(Double salary)
	{
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
	
}
