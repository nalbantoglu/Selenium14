package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {
		

		Map<Integer, Person > people = new TreeMap<>();
		
		people.put(3, new Person("Abeera", "M" , 25, 10000));
		people.put(2, new Person("Elma", "E" , 32, 11000));
		people.put(1, new Person("Paul", "S" , 40, 12000));
	
	//	System.out.println(people);
		
		Set<Entry<Integer, Person >> allEntries = people.entrySet();
		
		for(Entry<Integer, Person > entry :  allEntries )
		{
			Integer key = entry.getKey();
			Person value = entry.getValue();
			
			System.out.println(key + " ---> " + value.firstName);
			value.printDtails();
		}
		
		
		

	}

}
