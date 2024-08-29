package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListHW {
	
	/*
	 * /*
	Create a ArrayList that will store 5 names into it.
	▪ Find out whether the given ArrayList is empty or not?
	▪ Check whether the specific name is present in an ArrayList or not?
	▪ Find the size of your ArrayList and print all values from the ArrayList
	 */

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();


		// adding names to arraylist
		names.add("Abit");
		names.add("Iana");
		names.add("Kevin");
		names.add("Elnur");
		names.add("Tima");
		
	
		
		
		System.out.println("Is the list empty --> " + names.isEmpty());	
		
		System.out.println("does it contain kevin --> "+ names.contains("Kevin")  );
		
		System.out.println("Size of the arraylist is --> " + names.size());
		
		System.out.println(names);
		
		
		for (String name : names )
		{
			System.out.print(name + " ");
		}
		
		
		
		
		
		
	}

}
