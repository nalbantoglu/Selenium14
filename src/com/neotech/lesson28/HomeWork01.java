package com.neotech.lesson28;

import java.util.ArrayList;

public class HomeWork01 {

	public static void main(String[] args) {
		
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("Coffee");
		drinks.add("Tea");
		drinks.add("Milk");
		drinks.add("Su");
		
		
		System.out.println(drinks);

		
		for (int i = 0; i < drinks.size(); i++)
			
		{
			String a = drinks.get(i);
			
			if(a.contains("a") || a.contains("e"))
			{
				drinks.set(i, "water");
						
			}
			
		}
		System.out.println(drinks);
		

	}

}
