package com.neotech.lesson20;

public class HomeWork02Employee {
	
	      public String company = "NeoTech";
	      
	      String name = "Abit";
	      
	      protected String lastName = "Soylu";
	      
	      private int ssn = 123456;
	      
	      public void emp ()
	        {
	        	System.out.println("Everyone can search and see this information");
	        }
	        
	        protected void accessToLastName ()
	        {
	        	System.out.println("Only managers can see employees last name");
	        }
	        
	        private void hrOnlyAccess()
	        {
	        	System.out.println("Only HR can access this information");
	        }
	
	    

	public static void main(String[] args) {
		

//		Homework 2:
//			  Write a program that will have 4 different access levels of constructors and create 3 objects of this class: 
//				  1 -inside same class; 
//		          2 -from outside the class;
//		          3 -from different class inside different package and observe result.
		
		
		HomeWork02Employee emp = new HomeWork02Employee();
		
		
		emp.emp();
		System.out.println("public information --> " + emp.company);
		
		System.out.println();
		
		System.out.println("default -- > "+ (emp.name));
		System.out.println();
	    	 
		emp.accessToLastName();
		System.out.println("protected -- > "+ emp.lastName );
		System.out.println();
	    
		emp.hrOnlyAccess();
		System.out.println("private -- > "+ emp.ssn );
		
		
	}

	
		
	}


