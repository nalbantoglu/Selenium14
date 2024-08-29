package com.neotech.lesson32;

import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWork02 {

	public static void main(String[] args) {
	
//
//		Homework 2:
//		    Create the collection that will store single unique objects of a String type in which order is preserved.
//		    Write a logic to concatenate all string from the collection.
		
		
		
		Set<String> set = new LinkedHashSet<>();
				
		set.add("Today");
		set.add("is");
		set.add("Thursday");
		set.add("and");
		set.add("it's");
		set.add("too");
		set.add("hot");
		
		
		// first way
		
		String output = "";
		
		for(String str: set)
		{
			output += str + " " ;
		//	output.concat(str).concat(" " );
			
		}
		
		System.out.println(output);
		
		
		StringBuilder sb = new StringBuilder();
		
		for(String str : set)
		{
			sb.append(str).append(" ");
			
		}
		System.out.println(sb);
		
		
		
		
		
		
		
		
		

	}

}
