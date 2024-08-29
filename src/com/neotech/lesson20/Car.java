package com.neotech.lesson20;

public class Car {

	
	
	    String brand;
	    String color;
	    double mile ;
	    
	    Car()
	    {
	    	System.out.println("This is default constructor");
	    
	    }
	    
	    Car(String str1, String str2, double dbl)
	    {
	    	System.out.println( str1 + " " + str2 + " " + dbl );
	    	brand = str1;
	    	color = str2;
	    	mile = dbl;
	    	
	    }
	    
	    void printDetails()
	    {
	    	System.out.println("I have a " + color+ " "  + brand  + " milage of " + mile);
	    }
}
