package com.neotech.lesson23;

public class Programming {
	
//	
//	 Create a class named 'Programming'. 
	    //While creating an object of the class, if nothing is passed to it, 
	//   then the message "I love programming languages" should be
//	    printed. 
	//  If some String is passed to it, then in place of
//	    "programming languages" the value variable should be
//	    printed. Example, if we pass "Java", then "I love Java"
//	    should be printed.
//
	
	// even if i do not create constructor default constructor is executed 
	// by creating constructor we get to say on how the object is created 
	
	
	// we can modify or even decide not to use the default constructor
	
	
	Programming()
	{
		System.out.println("I love Programming language");
	}
	
	Programming(String str)
	{
		System.out.println("I love " + str);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Programming p1 = new Programming();
		
		
		Programming p2 = new Programming("Java");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
