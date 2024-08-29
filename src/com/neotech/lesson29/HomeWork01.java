package com.neotech.lesson29;

import java.util.*;

public class HomeWork01 {

	public static void main(String[] args) {

		/*
		 * Homework 1: Create an arrayList of drinks. If any drink has letter "a" or "e"
		 * replace it with water.
		 * 
		
		 * 
		 * 
		 * 
		 * Homework 4: Create a Card class that will have implemented and unimplemented
		 * methods and a constructor that will initializes credit card type. Create 3
		 * subclasses of a Card card. Create 3 objects of different card and store them
		 * into LinkedList. Using for loop/advanced for loop/iterator access all methods
		 * of the class.
		 * 
		 * 
		 * 
		 * Homework 1: Create an arrayList of drinks. If any drink has letter "a" or "e"
		 * replace it with water.
		 */

		
		
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("coffee");
		drinks.add("soda");
		drinks.add("milk");
		drinks.add("tea");
		drinks.add(1,"water"); // if index is specified, the element will be inserted on that index
		// java will take care of changing the index of all affected elements 
		
		System.out.println(drinks);
		
		
	/*	
        LinkedList<String> drinksLL = new LinkedList<>();
		
        drinksLL.add("coffee");
        drinksLL.add("soda");
        drinksLL.add("milk");
        drinksLL.add("tea");
        drinksLL.add(1,"water"); // if index is specified, the element will be inserted on that index
		// java will take care of changing the index of all affected elements 
		
		System.out.println(drinksLL);
		
    */
		// usinf for each
		
		for(String drink : drinks)
		{
			// check if it contains the letter a or e
			
			if (drink.contains("a") || drink.contains("e"))
			{
				drink = drink.replace(drink, "water");
				
			}
				System.out.print(drink + " ");	
		
		}
		
		System.out.println();
		
		
		// with indexed for loop
		
		for (int i = 0; i < drinks.size(); i++)
		{
			
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e") )
			{
				drinks.set(i, "water");
			}
			
		}
		System.out.print(drinks + " ");	
		
		
		
		
		
	}

}
