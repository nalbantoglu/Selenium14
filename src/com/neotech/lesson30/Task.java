package com.neotech.lesson30;

import java.util.*;
import java.util.Map;

public class Task {

	public static void main(String[] args) {
		

		
		HashMap<Integer, String> building = new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "Neotech");
		building.put(4, "Dell");
		building.put(5, "Microsoft");
		building.put(6, "Neotech");
		building.put(5, "Samsung"); // updated 5th floor
		
		
		System.out.println(building + " \nNumber of the enteries is --> " + building.size());
		
		building.put(4, "Lenovo");
		
		System.out.println("4th Floor updated --> " + building);
		
		building.remove(3);
		System.out.println("Company on 3rd floor removed --> "+building);
		
		System.out.println();
		
		System.out.println(building);

	}

}
