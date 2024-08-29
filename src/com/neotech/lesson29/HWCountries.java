package com.neotech.lesson29;

import java.util.*;


public class HWCountries {

	public static void main(String[] args) {
		

		/*
		 * Homework 1:
            Create a Set collection in which you need to add names of the countries. 
            In this set we want all objects to be sorted in alphabetical order. 
            Using 2 different ways retrieve all elements from set.
		 */
		
		
		Set<String> countries = new TreeSet<>();
		
		countries.add("Turkiye");
		countries.add("Germany");
		countries.add("Mexico");
		countries.add("Georgia");
		countries.add("France");
		countries.add("England");
		countries.add("Canada");
		
		System.out.println(countries);
		
      
		
		System.out.println("-----------------");
		
		

		System.out.println("Using for each loop");
		
		for(String c : countries)
		{
			System.out.print(c + ",");
		}
		
		System.out.println();
		
		System.out.println("-----------------");
		
	     System.out.println("Using iterator");
		
		Iterator<String> c = countries.iterator();
		
		while(c.hasNext())
		{
			String counrties = c.next();
			System.out.print(counrties + ",");
		}
		
		
		
		
		
	}

}
