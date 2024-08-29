package com.neotech.lesson29;

import java.util.*;
import java.util.Set;

public class SetFamily {

	public static void main(String[] args) {
		

		
		
		Set<String> veggies = new 	HashSet<>(); // will allow dublicate no insertion order maintained 
		
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("onion");
		veggies.add("tomato");
	//	veggies.add(null);        TreeSet will not except null 
		
		
		System.out.println(veggies); // no insertion order
		
		

		// Set<String> veggies = new 	HashSet<>();
		// set is interface has no implememntation what ever action is performe
		// it is define by the type object casted 
		
		// LinkedHashSet<>(); -- > no dublicate, maintains insertion order
		
		Set<String> fruits = new LinkedHashSet<>(); 
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
	//	fruits.add(null);      // null is not excepted on TreeSet
		
		
		System.out.println(fruits);
		
		
		System.out.println();
		
		//TreeSet -- no dublicates, ascending order /// null is not accepted 
		
		
		Set<String> food = new TreeSet<>(); 
		
		food.add("soup");
		food.add("eggs");
		food.add("fish");
		food.addAll(veggies);
		food.addAll(fruits);
		
		
		
		
		System.out.println(food);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
