package com.neotech.lesson29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HWCities {

	public static void main(String[] args) {

		/*
		 * Homework 2: 
		 * Create a Set of cities in which you want to make sure that
		 * insertion order is maintained. Using Iterator remove any city that starts with “A”;
		 * 
		 */

		
		Set<String> cities = new LinkedHashSet<>();
		
		cities.add("Istanbul");
		cities.add("New York");
		cities.add("Akcabat");
		cities.add("Eskisehir");
		cities.add("Adana");
		cities.add("Canakkale");
		
		System.out.println("Size of the cities is --> " + cities.size());
		
		System.out.println("Maintained insertion ordere -- > " + cities);
		
		
		
		// Using Iterator to remove any city that starts with “A”;
		
		Iterator<String> remove = cities.iterator();
		
		while (remove.hasNext())
		{
			String r = remove.next();
			if(r.startsWith("A"))
			{
				remove.remove();
			}
			
			
		}
		
		System.out.print("Removed cities starts with letter A --> " + cities + ",");
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
