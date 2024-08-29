package com.neotech.lesson31;

import java.util.*;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class EntrySet {

	public static void main(String[] args) {
	

		
		
		Map<String, String> countries = new TreeMap<>();
		
		countries.put("France","Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("USA","Washington DC");
		countries.put("Albania" ,"Tirana");
		countries.put("Italy", "Rome");
		
		System.out.println("MAP OBJECT  --> " + countries );
		

		Set<Entry<String, String>> allEntries  = countries.entrySet();
		
		System.out.println("Converted into SET OBJECT --> " + allEntries);
		
	//	Print all keys and value in uppercase 
		
		System.out.println("------- Using For Each ------------");
		
		for( Entry < String, String> entry : allEntries)
		{
			String key = entry.getKey();
			String value = entry.getValue();
					
					System.out.println(key.toUpperCase() + "  --> " + value.toUpperCase());
		}
		
		System.out.println("------- Using ITERATOR ------------");
		
		
		
		
		Iterator<Entry < String, String>> it = allEntries.iterator();
		
		while(it.hasNext() )
		{
			Entry<String, String> entry = it.next();
			
			System.out.println(entry.getKey().toUpperCase() + " --> " + entry.getValue().toUpperCase());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
