package com.neotech.lesson28;

import java.util.*;

public class HomeWork02 {

	public static void main(String[] args) {
		//Homework 2:
	   // Create an arrayList of even numbers from 1 to 50. 
		//Using Iterator remove any number that is divisible by 5 from that arrayList.

		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		
		for (int i = 1; i <= 50; i ++)
		{
			if ( i % 2 == 0)
			{
				numbers.add(i);
			}
			
		}
		System.out.println("Even numbers --> " + numbers);
		
		
		Iterator<Integer> byFive = numbers.iterator();
		
		while(byFive.hasNext())
		{
			if(byFive.next() % 5 == 0)
			{
				byFive.remove();
			}
		}
		System.out.println("Numbers not divisiable by 5 --> " + numbers);
		
		
		
		
	}

}
