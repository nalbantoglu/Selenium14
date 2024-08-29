package com.neotech.lesson18;

public class HomeWorkStudents {

	public static void main(String[] args) {

		/*
		 * Create a Class called Students ▪ 
		 * Create three variables studentName,
		 * studentID and numberOfStudents (should be a static variable) 
		 * ▪ Create three objects of the Students Class ▪
		 * Set the value for studentName, studentID and increment the numberOfStudents for each object ▪ 
		 * Print out total the number of students
		 */

		Students student1 = new Students();
		
		student1.studentName = "Abit";
		student1.studentID = 234;
		student1.numberOfStudents++;
		
		
		
		Students student2 = new Students();	
		student2.studentName = "Ahmet";
		student2.studentID = 152;
		student2.numberOfStudents++;
		
		
		
		Students student3 = new Students();	
		student3.studentName = "Kezban";
		student3.studentID = 23;
		student3.numberOfStudents++;
		
		System.out.println("Total number of students is: " + Students.numberOfStudents );
		
		
		
	}

}
