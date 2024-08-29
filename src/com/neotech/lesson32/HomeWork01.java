package com.neotech.lesson32;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork01 {

	public static void main(String[] args) {

//
//		Homework 1:
//			   Create a Map that will store Employee name and salary. 
		// Write a logic to retrieve an employee who gets the highest salary.
//			   Output should be in the below format
//				- John Smith=$100000

		Map<String, Integer> empMap = new LinkedHashMap<>();

		empMap.put("Emrah", 10000);
		empMap.put("Uygar", 15000);
		empMap.put("Jackeline", 5000);
		empMap.put("Iana", 7000);
		empMap.put("Sabah", 4000);

		System.out.println(empMap);

		System.out.println();

		// finding the highest

		Collection<Integer> salaries = empMap.values(); // getting values to find highest

		int max = 0;
		for (int s : salaries) {
			if (s > max) {
				max = s;

			}

		}
		System.out.println("The highest salary is --> " + max);

		// antoher short way of finding number in a collection

		System.out.println("highest salary is --> " + Collections.max(salaries));

		System.out.println();

		Set<Entry<String, Integer>> entrySet = empMap.entrySet(); // converting map into set sp we can loop

		System.out.println("This is a MAP--> " + empMap);

		System.out.println("This is a SET--> " + entrySet);

		System.out.println();

		Iterator<Entry<String, Integer>> it = entrySet.iterator();

		Entry<String, Integer> maxEntry = it.next();

		// i an do it in one line
		// Iterator<Entry<String , Integer>> it = empMap.entrySet().iterator();

		while (it.hasNext()) {

			Entry<String, Integer> entry = it.next();

			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;

			}

		}

		System.out.println("The highest is: " + maxEntry.getKey() + " - " + maxEntry.getValue());

	}

}
