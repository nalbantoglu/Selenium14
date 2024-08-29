package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Set;

public class HWStudent {

	/*
	 * Homework 3: Create a Set collection that will hold Objects of Student Type.
	 * In this set we do not care about the insertion order. Each student object
	 * should have name and studentID. Display name of each student.
	 */

	String name, studentID;

	HWStudent(String name, String studentID) {

		this.name = name;
		this.studentID = studentID;

	}

	
	public static void main(String[] args) {
		
		
		Set <HWStudent> student = new HashSet<>();
		
		student.add(new HWStudent ("Abit" , "a001"));
		student.add(new HWStudent ("Hamdi" , "a023"));
		student.add(new HWStudent ("Kamil" , "a03"));
		student.add(new HWStudent ("Saban" , "a09"));
		student.add(new HWStudent ("Kezban" , "a021"));
		
		
		
		for(HWStudent s : student)
		{
			
			System.out.println("Student name is: " + s.name + " and  studentID is: " + s.studentID);
			
		}
		
		
		
		
		
		
	}
	
	
	
	
}

