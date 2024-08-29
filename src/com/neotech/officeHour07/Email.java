package com.neotech.officeHour07;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		
//
//		Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.
//
//		Examples:
//
//		input: mike_tyson@gmail.com
		
//		output: tyson_mike@gmail.com
//		
		
		 Scanner scan = new Scanner(System.in);
		 
		 String inputEmail = scan.next();
		 
		 
		 // in the ideal case name lastname and emailType
		 
		 
		 // two posibble way to id 
		 
		 //1st substring 
		 // index of _ 
		 // index of @
		 
		 int underIndex = inputEmail.indexOf("_");
		 int atIndex = inputEmail.indexOf("@");
		 
		 
		 if (underIndex == -1)
		 {
			 System.out.println(inputEmail);
		 }
		 else
		 {
			 String firstName = inputEmail.substring(0, underIndex);
			 String lastName = inputEmail.substring(underIndex+1, atIndex);
			 String domain = inputEmail.substring(atIndex);
		 }
		 
		 
		 
		 // using split 
		 
		 
		 String [] parts = inputEmail.split("[_@]");
		 
		 
		 if (parts.length == 2)
		 {
			 System.out.println(inputEmail);
		 }
		 
		 else
		 {
			 System.out.println(parts[1] + "_" + parts[0]+ "@" + parts[2]);
			 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		   

		 
		 
		 
		 
		 
		 

	}

}
