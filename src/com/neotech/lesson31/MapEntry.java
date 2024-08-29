package com.neotech.lesson31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		

		
		Map<String, Integer> months = new LinkedHashMap<>();
		
		months.put("Jan", 31);
		months.put("Feb", 29);
		months.put("Mar", 31);
		months.put("Apr", 30);
		
		System.out.println("Months --> " + months);
		
		System.out.println("Size of my map is --> " + months.size());
		
		// sysntax
		// Entry<String, Integer>  ---> any entry of object of String to Integer
		
		System.out.println("Entry  --> " + months.entrySet());
		
		
		System.out.println("---------------");
		
		Set<Entry<String, Integer>> entries = months.entrySet(); // this is how we iterate map 
		System.out.println(entries);
		
		for(Entry<String, Integer> entry :entries )
		{
			//System.out.println(entry);
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		}
		
		
		
		
		System.out.println("--------------");
		
		Iterator<Entry<String, Integer>> it  = entries.iterator();
		
		while(it.hasNext())

		{
			Entry<String, Integer> entry  = it.next();
			
			System.out.println("This is entry --> " + entry);
			System.out.println("Key --> "+ entry.getKey() + " ---> " + " Value --> " + entry.getValue());
		}
		
		
		
		
		
		
		

	}

}
