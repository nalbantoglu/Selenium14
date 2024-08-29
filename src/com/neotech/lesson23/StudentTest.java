package com.neotech.lesson23;

public class StudentTest {

	public static void main(String[] args) {
		

		Student s = new Student();
		s.name = "Abit";
		s.learning();
		s.timeAtSchool();
		
		System.out.println();
 
		NeotechStudent n = new NeotechStudent();
		n.name = "Kamil";
		n.major = "Java";
		n.learning();
		n.timeAtSchool();
		
			
		System.out.println();
		
		
		CollegeStudent col = new CollegeStudent("Hamdi");
		
		col.learning();
		col.timeAtSchool();
		
		System.out.println();
		
		SchoolStudent s2 = new SchoolStudent("Hayrettin");
		
		s2.learning();
		s2.timeAtSchool();
		
		
	}

}
