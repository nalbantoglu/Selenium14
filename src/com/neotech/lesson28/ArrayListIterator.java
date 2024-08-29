package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> choco = new ArrayList<>();

		choco.add("Hershey");
		choco.add("Kinder");
		choco.add("Godiva");
		choco.add("Ulker");

		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Baklava");
		sweets.add("Treleche");
		sweets.add("Milkcake");

		// add all items in sweets list
		sweets.addAll(choco);

		System.out.println("Sweets has " + sweets.size() + " items");

		System.out.println(choco);
		
		System.out.println();
		
		
		System.out.println(" 1st way of printing ");

		for (String items : sweets) {
			System.out.print(items + ",");
		}

		// we can use loops (indexted or enhanced

		System.out.println();

		// 2.nd way using an iterator object

		Iterator<String> it = sweets.iterator();

		it.hasNext(); // --> this one checks if there is a next element in the list
		
		System.out.println();
		
		System.out.println("----------- Using while loop to iterate -----------");

		while (it.hasNext()) // this will run as long as there is elements in the sweets iterator
		{
			String element = it.next();
			System.out.print(element + ",");

			if (element.equals("Kinder")) 
			{
				it.remove(); // this will remove kinder from sweets element

			}

		}
		

		System.out.println();

		System.out.println(sweets);
		
		System.out.println();
		
		System.out.println("------ enhanced for loop -----------");
		
		for (String sweet : sweets)
		{
			System.out.print(sweet+ ",");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("-------- indexed for loop ---------");
		
		for (int i = 0; i < sweets.size() ; i++)
		{
			System.out.print(sweets.get(i) + ",");
		}
		
		
		
		
		

	}

}
