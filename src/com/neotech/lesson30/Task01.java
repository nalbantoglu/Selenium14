package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Map;

public class Task01 {

	public static void main(String[] args) {
	/*

		Create a map of a building. 
		Store floor number and its associated company name. 
		(Example: 1=Google, 2=Apple, 3=Neotech etc..). 
		Insert 5 entries with duplicate keys and values.
		- Check how many entries you have?
		- Update company on a 4th floor
		- Remove company on the 3th floor
		- Print your map


         Mapping depends on what you are dealing with
         






*/
		
		
		
		Map<Integer, String> building = new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "Neotech");
		building.put(4, "Dell");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		
		building.put(5, "Samsung"); // updated 7
		
		building.put(7, "Neotech"); // this is new pair even thoug the value is the same
		building.put(2, "Apple"); // dublicate key will not do anything
		
		System.out.println(building);
		
		
		// how many entries we have
		
		System.out.println("We have " + building.size() + " entries");
		
		building.replace(4, "Lenovo");
		// building.put($4, "Lenovo");
		
		System.out.println("update 4th Floor " + building );
		
		//remove company on 3rd floor
		
		building.remove(3);
		System.out.println("remove company on 3rd floor " + building );
		
		
		building.remove(10);
		
		System.out.println(building );
		
		
		System.out.println(building.replace(5, "Apple"));
		System.out.println(building );
		
		// ho would i make sure to replace
		
		if(building.containsKey(6))
		{
			building.replace(6, "Nvidia");
		}
		else 
		{
			System.out.println();
		}
		
		
		
	}

}
