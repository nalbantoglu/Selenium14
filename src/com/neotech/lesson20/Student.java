package com.neotech.lesson20;

public class Student {
	
	


	/*Write a java program of Class Student that takes students name and 3
//	   subject grades. 
//	   Inside your class also have a method to Calculate Average Grade. 
//	    Test Student class for 5 different students with different marks. 
//	    Your program should print an average mark of each students name.
	   * 
	   */
	// instance variables
	    String name;
	    int grade1, grade2, grade3;
	    
	    
	
	    Student(String studentName, int g1, int g2, int g3)
	    {
	    	
	    	name = studentName;
	    	grade1 = g1;
	    	grade2 = g2;
	    	grade3 = g3;
	    }
	    
	    int avarage()
	    {
	    	return (grade1 + grade2 + grade3) / 3 ;
	    }
	    	
	    	
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student("Abit", 95, 83, 74);
		
		
		Student s2 = new Student("Emrah", 85, 93, 84);
		
		Student s3 = new Student("Uygar", 81, 95, 64);
		
		System.out.println(s1.name+ " has avg: " + s1.avarage());
		
		System.out.println(s2.name+ " has avg: " + s2.avarage());
		
		System.out.println(s3.name+ " has avg: " + s3.avarage());
		
		s3.grade3 = 100 ;
		System.out.println(s3.name+ " has avg: " + s3.avarage());
		
		
		
	}
	

}
