package com.neotech.lesson22;

public class UserClass {
	
//	Homework 4:
//	    Write program: UserClass that has a constructor that
//	    initializes instance variable name and mobile number.
//	    Create a subclass UserInfo that will have user address
//	    variable and it also being initialized through constructor
//	    call. Print users name, mobile number and address in
//	    userDetails method. Test your code.
	
	
	
	String name;
	int mobileNumber;


}

     class UserInfo extends UserClass {
    	 
    	String address = "West Islip";
    	 
    	 
    	 void userDetails ()
    	 {
    		 System.out.println("User name: " + name + " number: " 
    	    + mobileNumber + " address: " + address );
    	 }
    
    	 
     }
     
     
     

       