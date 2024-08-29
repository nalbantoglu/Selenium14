package com.neotech.lesson31;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HWEmployee {

	public static void main(String[] args) {
		

//		Homework 1:
//			   Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. 
//			   Output should be in the below format
//				- John Smith=$100000
		
		
		Map<String, Integer> emp = new HashMap<>();
		
		emp.put("Ahmet", 112000);
		emp.put("Ali", 105000);
		emp.put("Abit", 125000);
		emp.put("Kezban", 118000);
		emp.put("Sebnem", 111000);
		emp.put("John", 109000);
		
		System.out.println(emp);
				
		Set<Entry<String, Integer>> set = emp.entrySet();
		
		System.out.println("Converting into SET --> " + set);
		
		
		
		for(Entry<String, Integer> entry : set)
		{
			Integer high = entry.getValue();
			
//			if (int highest <= high)
//			{
//				
//			}
			
			
			System.out.println(high);
		}
		
	

	}

}
