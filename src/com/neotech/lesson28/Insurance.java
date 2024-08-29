package com.neotech.lesson28;

public abstract class Insurance {
	
	/*
	 * Homework 3:
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote() and cancelInsurance().
    Create 3 subclasses Car, Pet, Health.
    Car class has its own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/iterator access all methods of the class.
	 */

	String insuranceName;
	
	public abstract void getQuote();
	
	public abstract void cancelInsurance();
	
	
}

class Car extends Insurance{
	
	String carModel ;
	
	public Car(String carModel) {
		
		super.insuranceName = insuranceName;
		this.carModel = carModel;
	}
	
	

	@Override
	public void getQuote() {
		System.out.println("I need insurance for my " + carModel);
		
		
	}

	@Override
	public void cancelInsurance() {
		
		System.out.println("Cancel my insurance for my " + carModel );
		
	}
	
	
}

class Pet extends Insurance{
	
	String petType;
	
	public Pet(String petType) {
		this.petType = petType;
		
	}

	@Override
	public void getQuote() {
		System.out.println("I need insurance for my " + petType);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Please cancel my insurance for my " + petType );
		
	}
}

class Health extends Insurance{

	@Override
	public void getQuote() {
		System.out.println("I need insurance for myself ");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Please cancel my health insurance");
		
	}
	
	 
}









//System.out.println("I needs insurance");