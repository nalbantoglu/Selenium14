package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		
   // creating object using the default constructor
		Student st1 = new Student();
		st1.displayInfo();
		st1.name = "Paul";
		st1.address = "LA";
		
		
		
		st1.displayInfo();
		
		System.out.println("------------");
		
		Student st2 = new Student("Abeera ");
		
		st2.address = "CT";
		st2.displayInfo();

		System.out.println("--------------");
		
		// how does java tell which constructor you are calling or using 
		// based on the constructor signature
		Student st3 = new Student("Umut ", "NY");
		
		st3.displayInfo();
		
	}

}
