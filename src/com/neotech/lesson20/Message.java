package com.neotech.lesson20;

public class Message {
	
	
	
	
	public Message ()
	{
		System.out.println("Default constructor");
		
		
		
	}
	
	
	Message (String str)
	{
		this(); // calling default constructor 
		
		System.out.println("Constructor with message: " + str);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
	//	Message msg1 = new Message();
		
		Message msg2 = new Message("Hello");
		
	}

}
