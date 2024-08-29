package com.neotech.lesson04;

public class HomeWork {

	public static void main(String[] args) {
		
		
		
		double scale = 1.609344;
		double km;               // declaring one varinle
		double km2, mile, mile2; //declaring multiple variable of the same type
		
		
		mile = 2;
		km = mile * scale;   //2*1.609344
		
		System.out.println(mile + " miles is " + km + " kilometers.");
		
		System.out.println("=======================");
	
		// km to miles conversion
		km2 = 60;
		mile2 = km2/scale;
		
		System.out.println(km2 + " kilometer is " + mile2 + " miles." );
		
		
		
		

	}

}
