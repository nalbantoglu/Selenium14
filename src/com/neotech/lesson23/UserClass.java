package com.neotech.lesson23;

public class UserClass {
	
	/*
	 * Homework 4:
    Write program: UserClass that has a constructor that initializes instance variable name and mobile number.
    Create a subclass UserInfo that will have user address variable and it also being initialized through constructor call. 
    Print users name, mobile number and address in  userDetails method. Test your code.
	 */

	
	String name;
	long mobileNumber;
	
	
	UserClass()
	{
		
	}
	
	
	// if i create parameterized constructor and do not create default constructor, that mean user
	// can only create an object using the parameterized constructor
	UserClass (String name, long mobileNumber)
	{
		this.name =  name;
		this.mobileNumber =  mobileNumber;
	}
	
	
	
}

class UserInfo extends UserClass {
	
	
	
	String address;
	
	
	UserInfo(String name, long mobileNumber, String address )
	{
		super(name,mobileNumber ); // if i do this i am calling default constructor
		this.address = address;
	}
	
	void userDetails()
	{
		System.out.println("User details: \n");
		System.out.println("Name --> " + name);
		System.out.println("Mobile ----> " + super.mobileNumber);
		System.out.println("Address ----> " + this.address);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("test");
	}
	
	
	
	
}








