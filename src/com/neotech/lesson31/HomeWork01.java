package com.neotech.lesson31;

import java.util.LinkedHashMap;
import java.util.*;

public class HomeWork01 {

	public static void main(String[] args) {
	

		/*
		 * Create a map of car models that you have in your garage and for each model the number of car you have.
     	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
			For example:
		"BMW" -> 2
			"Mercedes" -> 3
		"Audi" -> 3
		"Ferrari" -> 1

			- Check how many entries you have.
		- Update the number of Audis to 5.
			- Add a new model with any number of cars.
		- Check how many Ferraris you have.
	 Check if you have Honda in your map.
	 Remove Mercedes from the map.
	 Get all models from the map. (use keySet() method)

Note: After each step print the map.

		 */
		
		Map<String, Integer> car = new LinkedHashMap<>();
		
		car.put("BMW", 2);
		car.put("Audi",3);
		car.put("Ferrari",1);
		car.put("Mercedes", 4);
		
		// Check how many entries you have.
		
		System.out.println("How many enteries do i have? --> " + car.size());
		
		System.out.println(car);
		
		//- Update the number of Audis to 5.
		
		//car.put("Audi", 5); if audi exisits this willl update
	//	if ot does not it will add it 
		System.out.println("Audi updated --> " + car);
		
		car.replace("Audi", 5);
		System.out.println("Audi updated --> " + car);
		
		
		//- Add a new model with any number of cars.
		
		car.put("Tesla", 2);
		System.out.println("New car added --> " + car);
	
	//	- Check how many Ferraris you have.

		car.get("Ferrari");
		System.out.println("How many Ferraris do i have --> " + car.get("Ferrari"));
		
		
		// Check if you have Honda in your map.
		System.out.println("Do i have Honda --> " + car.containsKey("Honda"));
		
		// Remove Mercedes from the map.
		car.remove("Mercedes");
		System.out.println("Remove mercedes --> " + car + " --> MAP OBJECT Curly brackets");
		
		System.out.println("----------------");
		
		// Get all models from the map. (use keySet() method)
		
		System.out.println("All models   --->  "+ car.keySet() + " ---> SET object Square brackets");
		
		
		
		
		
		
	}

}
