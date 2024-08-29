package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
	
		// Treemap : will order pairs alphabetically according to the key
		
		Map<String,Integer> groceries = new TreeMap<>();
		
		
		groceries.put("Milk", 2);
		groceries.put("Bread", 3);
		groceries.put("Eggs", 12);
		
	//	groceries.put(3 , "Oil");  CE : key has to be a Strfing anf value an integer
		
		groceries.put("Oil", 3);
		groceries.put("Apples", 2);
		
		System.out.println(groceries);
		
		

		Set<String> keys = groceries.keySet(); // getting keys wich is String 
		System.out.println("Keys of the groceries --> " + keys);

		Collection <Integer> values = groceries.values();
		System.out.println("Values of the groceries --> " + values);
		
		
		
		//iterating through keys
		
		for(String key : keys)
		{
			System.out.println(key + " - " + groceries.get(key));
		}
		
		// using Iterator
		
		Iterator<Integer> it = values.iterator();
		
		while(it.hasNext())
			
		{
			System.out.print(it.next() + ",");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
