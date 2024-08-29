package com.neotech.lesson23;

public class Student {
	
	/*
	 * Homework 2:
    ▪ Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
    
    ▪ Define common behavior within the parent class and override some of the methods in the child classes
    
    ▪ Define some methods specific to the child classes
    
    ▪ Write an example of achieving run time polymorphism
    
	*/
	
	Student()
	{
		
	}
	
	
	 String name;
     String major;
	
	public Student (String name , String major)
	{
		
	}
	
	
	public void learning()
	{
		System.out.println(name + " studying");
		
	}
	
	public void timeAtSchool()
	{
		System.out.println(name + " goes to school full time.");
	}
	
}

class NeotechStudent extends Student{
	
	
	public void learning()
	{
		System.out.println(name + " learning " + major);
	}
	
	public void type()
	{
		System.out.println("NeoTech student");
	}
	
	
	
}

class CollegeStudent extends Student{
	
	CollegeStudent(String name)
	{
		this.name = name;
		System.out.println(name + " works partime");
	}
	public void learning()
	{
		System.out.println(name + " studying biyology");
	}
	
}

class SchoolStudent extends Student{
	
	SchoolStudent(String name)
	{
		this.name = name;
		
	}
	
	public void timeAtSchool()
	{
		System.out.println(name + " goes to school full time.");
	}
}
