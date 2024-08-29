package com.neotech.lesson29;

public abstract class HWCard {
	
	/*
	Homework 4:
	    Create a Card class that will have implemented and unimplemented methods and a constructor that will initializes credit card type.
	    Create 3 subclasses of a Card card.
	    Create 3 objects of different card and store them into LinkedList.
	    Using for loop/advanced for loop/iterator access all methods of the class.
       */
	
	String cardType;



	HWCard (String cardType){
		this.cardType = cardType;
	}
	
	void checkBalance() {
		
		
		System.out.println("Your balance is -- > ");
	}
	
	public abstract double  limit ();
	
}

class Visa extends HWCard{

	Visa(String cardType) {
		super(cardType);
		
	}
	
	

	@Override
	public double limit() {
		System.out.println("Your " + cardType + " card limit is --> " );
		return 15000;
	}
	
void checkBalance() {
		
		
		System.out.println("Your balance is -- > 2400$ ");
	}
	
	
	
}

class MasterCard extends HWCard{

	MasterCard(String cardType) {
		super(cardType);
		

	}

	@Override
	public double limit() {
		System.out.println("Your" + cardType + " card limit is --> " );
		return 12000;
	}
	
void checkBalance() {
		
		
		System.out.println("Your balance is -- > 1300$ ");
	}
	
	
}

class Discovery extends HWCard{

	Discovery(String cardType) {
		super(cardType);
		
	}

	@Override
	public double limit() {
		System.out.println("Your" + cardType + " card limit is --> " );
		return 13000;
	}
	
void checkBalance() {
		
		
		System.out.println("Your balance is -- > 400$ ");
	}
	
	
}





















