package com.neotech.lesson32;

import java.util.ArrayList;
import java.util.List;

public class HomeWork03 {

	public static void main(String[] args) {
		

		/*
		 * Homework 3:
           Create a collection of integers in which you can keep duplicates. 
           Write a logic to find sum of all integers
		 */
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(55);
		numbers.add(25);
		numbers.add(3);
		numbers.add(62);
		numbers.add(33);
		numbers.add(25);
		
		// getting the sum
		int sum = 0;
		for(Integer i : numbers)
		{
			sum += i;
			
		}

		System.out.println("Sum of the numbers --> " + sum);
		

	}

}
