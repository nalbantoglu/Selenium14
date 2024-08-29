package com.neotech.lesson23;

public class CrediCard {
	
	
	/*
	 * Homework 1:
    ▪ Create a class CreditCard and define two variables, balance and interest.
    ▪ Create an instance method that will calculate the interest based on the given balance.
    ▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
    ▪ Call the method by creating an object of each of the three classes.
    
    
	 */

	
	double balance;
	double interest;
	
	public CrediCard(double balance)
	{
		this.balance = balance;
		
	}
	
	
	public void calcInterest()
	{
		 interest  = balance * 0.19 ;  // assuming interest rate 19%
		 
		System.out.println("Credit card interest --> " + interest);
		
		
	}
	
	
}

class Visa  extends CrediCard{
	
	
	public Visa (double balance)
	{
		super(balance);
	}
	
}

class Ax extends CrediCard{
	
	
	public Ax(double balance)
	{
		super(balance);
		
	}
	
	public void calcInterest()  // overriding from credit card class
	{
		this.interest = balance * 0.25;   
		System.out.println("AX card interest --> " + interest);
	}
	
	
}
















