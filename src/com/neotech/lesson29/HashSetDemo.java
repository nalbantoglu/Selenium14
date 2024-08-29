package com.neotech.lesson29;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		

		HashSet<String> breakfast = new HashSet<>();
		
		breakfast.add("eggs");
		breakfast.add("cheese");
		breakfast.add("tea");
		breakfast.add("coffee");
		breakfast.add("cheese"); // it will avoid dublicates
		breakfast.add(null);
		
		System.out.println(breakfast);
		
		

	}

}
