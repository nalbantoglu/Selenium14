package com.neotech.lesson20;

public class HomeWorkStudent {
	
	
	static String name , address;
	
	
	HomeWorkStudent()
	 {
		name = "Abit";
		address = "1999 Orinoco Drive";
     }
	
	void printDetails() 
	{
		System.out.println("Student name is: " + name + " and address is: " + address);
	}
	    

	public static void main(String[] args) {
		
//		Homework 1:
//		    Write program as a Student class that has instance variables name and address. 
//		    Create a constructor that will initialize those variables.
//		    Print name & address of given student using displayInfo method.
         
		HomeWorkStudent task = new HomeWorkStudent();
		
		
		task.printDetails();
		
		

		

	}

}
