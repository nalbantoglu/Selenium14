package com.neotech.lesson21;

public class MathTeacher extends Teacher {
	
	
	boolean goodWithNumber;
	
	public void teachesMath()
	{
		System.out.println(name + " teaches Math");
	}
	
	public static void main(String[] args) {
		
		
		
		MathTeacher mt = new MathTeacher();
		
		mt.name = "Neha";       // from parent class
		
		mt.goodWithNumber = true; // attribute of the child class(MathTeacher)
		
		mt.teaches();  // from parent class
		mt.teachesMath(); // from child class(MathTeacher)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
