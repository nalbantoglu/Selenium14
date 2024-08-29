package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
	//	ArrayList<int> numbers = new ArrayList<>(); can not contain pirimitive type

		ArrayList<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(10); // auto boxing
		
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println("Element at index two is: " + numbers.get(2));
		
		
		System.out.println("Does numbers contain 30? " + numbers.contains(30)); // asking if array contains number 30
		
		
		System.out.println("Does number array list contain 50? " + numbers.contains(50));
		
		
		System.out.println(numbers);
		
		numbers.remove(0); // removee element at index 0
		
		System.out.println(numbers);
		
		numbers.remove(new Integer (40)); // remove the element 40 not the index 
		
		System.out.println(numbers);
		
		// we have the object we can remove it directly
		
		numbers.add(50);
		System.out.println(numbers);
		
		Integer el = 50;
		
		numbers.remove(el);
		
		System.out.println(numbers);
		
		numbers.clear(); // deletes all the numbers and size will be empty
		System.out.println(numbers);
		
		
	}

}
