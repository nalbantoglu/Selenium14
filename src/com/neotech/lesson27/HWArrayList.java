package com.neotech.lesson27;

import java.util.ArrayList;

public class HWArrayList {
	
	/*
	Create a ArrayList that will store 5 names into it.
	▪ Find out whether the given ArrayList is empty or not?
	▪ Check whether the specific name is present in an ArrayList or not?
	▪ Find the size of your ArrayList and print all values from the ArrayList
*/
	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		
		System.out.println("is arraylist empty --> " + names.isEmpty());
		
		names.add("Abit");
		names.add("Abbas");
		names.add("Hamdi");
		names.add("Kamil");
		names.add(1, "Ali");
		
		System.out.println("Is arraylist empty after adding names --> " + names.isEmpty());
		
		System.out.println("Does arraylist contain Ali --> " + names.contains("Ali"));
		
		System.out.println("Does arraylist contain Ahmet --> " + names.contains("Ahmet"));
		
		System.out.println("Size of the araylist is --> " + names.size());
		
		System.out.println("Value of the arraylist " + names);
		
		
	}

}
