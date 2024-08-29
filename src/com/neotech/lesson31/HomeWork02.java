package com.neotech.lesson31;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HomeWork02 {

	public static void main(String[] args) {
		
/*
		Create a map of countries with its capital that will store countries in alphabetical order.
		Add them randomly in the map.
		Example:
		    "France" -> "Paris"
		    "Kosovo" -> "Prishtina"
		    "Turkey" -> "Ankara"
		    "USA" -> "Washington DC"
		    "Albania" -> "Tirana"
		    "Italy" -> "Rome"

		    - Print the list and check the order of the countries.
		    - Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
		    - Verify if a specific capital city is in the list ( use containsValue() method )
		    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
		    - Get all the values (capital names) in a Collection. Print all capital names using iterator.

*/
		
		Map<String, String> countries = new TreeMap<>();
		
		countries.put("France","Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("USA","Washington DC");
		countries.put("Albania" ,"Tirana");
		countries.put("Italy", "Rome");
		
		System.out.println("Order of the countries --> " + countries );
		
		//Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
		
		System.out.println("Verifing  if I have Albania in the list ---> " + countries.containsKey("Albania"));
		System.out.println("Verifing  if I have Turkiye in the list ---> " + countries.containsKey("Turkiye"));
		
		//Verify if a specific capital city is in the list ( use containsValue() method )
		
		System.out.println("does Ankara exist in the list --> " + countries.containsValue("Ankara"));
		
	//	Get all the keys (countries names) in a Set. Print all country names using for each loop.
		
		Set<String> keys = countries.keySet();
		
		for (String key : keys)
		{
			String k = key;
			System.out.print( k + ", ");
		}
		System.out.println();
		
		
		//Get all the values (capital names) in a Collection. Print all capital names using iterator. 
		
		Collection <String> value = countries.values();
		
		Iterator<String> it = value.iterator();
		
		while (it.hasNext())
		{
			String v = it.next();
			System.out.print(v + ", ")  ;
					
		}
		
		
		

		
		
		
		
	}

}
