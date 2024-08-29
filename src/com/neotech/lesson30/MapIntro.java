package com.neotech.lesson30;

import java.util.HashMap;
import java.util.HashSet;

public class MapIntro {

	public static void main(String[] args) {


		HashSet<String> hs = new HashSet<>();
		
		hs.add("Abeera");
		hs.add("Iana");
		
		System.out.println("Set: " + hs);
		
		System.out.println("---------------");
		
		//<K, V> ---> a pair ---> entry
		//for this HashMap example, key is Integer, and value is String
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Abeera");
		map.put(2, "Jackeline");
		map.put(3, "Iana");
		
		System.out.println("Map: " + map);

		System.out.println("---------------");
		
		
		//what if I:
		map.put(2, "Paul"); //update the value for key 2
		
		System.out.println("Map: " + map);
		System.out.println("---------------");
		
		
		//keys have to be unique, values can have duplicates
			//keys 	 ---> definition of a SET
			//values ---> definition of a LIST
		
		boolean isEmpty = map.isEmpty();
		System.out.println("Is my map empty? " + isEmpty);

		System.out.println("---------------");

		
		System.out.println("The size of the map: " + map.size());

		System.out.println("---------------");
		
		
		//map.put("4", "Ebru"); //CE: we have to use an Integer key
		map.put(4, "Ebru");
		
		map.put(15, "Paul");
		System.out.println("Map: " + map);

		System.out.println("---------------");
		
		
		//if the key exists, this will update. If the key does not exist, this will add a new pair/entry
		map.put(9, "Fasry");
		map.put(7, "Emrah");
		
		System.out.println("Map: " + map);

		System.out.println("---------------");
		
		//how do I get values?
		String name = map.get(7);
		System.out.println(name);
		
		
		//how would I replace a value??
		map.replace(2, "Umut");
		System.out.println("Map: " + map);

		System.out.println("---------------");

		//how would I remove an entry
		System.out.println("Removing by key: " + map.remove(15));
		System.out.println("Map: " + map);

		System.out.println("---------------");
		
		//map.remove(15, "Paul");
		System.out.println("Removing by key and value: " + map.remove(9, "Fasry"));
		System.out.println("Map: " + map);

		System.out.println("---------------");
		
		//check if a key is in the map??
		boolean containsKey = map.containsKey(9);
		System.out.println("Contains 9: " + containsKey);

		System.out.println("---------------");
		
		//check if a value is in the map
		boolean containsValue = map.containsValue("Emrah");
		System.out.println("Contains Emrah: " + containsValue);

		System.out.println("---------------");
		
		
	}

}