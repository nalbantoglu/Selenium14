package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {
		
		
		 ArrayList<Double> numbers = new  ArrayList<>();

		numbers.add(3.7);
		numbers.add(2.4);
		numbers.add(3.3);
		numbers.add(6.5);
		 
	//	numbers.add("Abeera"); not able to do this because numbers is double arraylist compiler error
		// only able to store double in the list
		
	//	numbers.add(4); compiler erro only able to store double in the list not int 
		
		System.out.println(numbers);
		
		System.out.println();
		
		//lets replace the items on the array list
		
		numbers.set(1, 4.4);
		System.out.println(numbers);
		
	//	numbers.set(2, 1.1); // runtime error outof bounds.. we dont have index 2 to replace Index 2 out of bounds for length 2
		
		// lets remove an item from the list
		
//		numbers.remove(0); // removing index 0 
//		System.out.println(numbers);
//		
//		numbers.remove(3.3); // removing value 
//		System.out.println(numbers);
//		
//		numbers.remove(3.3); // looking for the number but it does not exists nothing will happing 
//		System.out.println(numbers);
		
		
		
		 ArrayList<Integer> intArray = new  ArrayList<>();
		 
		 intArray.add(1);
		 intArray.add(1);
		 intArray.add(1);
		 intArray.add(2);
		
// 	 intArray.remove(1); // removing index 1 which is 2
		 
		 // if i have more than one with same number it will not go further it will stop[ at the first one 
		 
		 intArray.remove(Integer.valueOf(1)); // i have to use valueof to remove value 1 which is index 0
		 
		 System.out.println(intArray);
		

		 // lets find an element in the list 
		 
		System.out.println("getting 1 index" + intArray.get(1));
		
		System.out.println();
		
		 
		for(int i= 0 ; i < numbers.size() ; i++ )
			
		{
			System.out.print(numbers.get(i) + " ");
		}
		
		System.out.println();
		
		for (Double number : numbers)
		{
			System.out.print(number + " ");
		}
		
		System.out.println("---------------");
		
		// generic arraylist
		ArrayList<String> al3 = new ArrayList<>();
		
		
		System.out.println("NON generic ArrayList thype is not specified ");
		
		
		ArrayList al2 = new ArrayList();
		
		al2.add(3); // adding int
		al2.add("Uygar"); // adding string
		al2.add(3.4); // adding double
		al2.add('$');// adding char
		
		for (Object item : al2)
		{
			System.out.print(item + ",");
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
