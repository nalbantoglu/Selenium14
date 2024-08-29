package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task01 {

	public static void main(String[] args) {
	
		// Create arrayList with 6 different words.
				// Remove every word that end with 'e'. Use iterator.

				ArrayList<String> words = new ArrayList<>();
				
				words.add("Coffee");
				words.add("Tea");
				words.add("Milk");
				words.add(0, "Orange juice");
				words.add(1, "Apple juice");
				words.add("Water");
				System.out.println(words);

				Iterator<String> it = words.iterator();

				while (it.hasNext()) {
					String word = it.next(); // using word to hold to value. i can not use it.next twice, it will jump to next item

					if (word.contains("e") || word.contains("a")) {
						it.s();
					}
				}

				System.out.println(words);


	}

}
