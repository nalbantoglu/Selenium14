package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWorkLoan {

	public static void main(String[] args) {

	
		/*
		 * 1. You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
           If loan is less or equal to 200,000 then you would lend the money 
           otherwise you would reject the client.
		 */
	
	    Scanner loan = new Scanner(System.in);
	    
	    		
	   int user = 200000;
	   
	   System.out.println("please enter amount");
	   int amount = loan.nextInt();
	  
	   if (user < 200000)
	   {
		   System.out.println("Your loan has been approved amount of: " + amount);
	   }
	   
	   else 
	   {
		   System.out.println("Your loan has been rejected: "+ amount);
	   }
	   
	   
			   
	   
	
	
	
	
	
	
	
	
	
	}

}
