package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {

		Flower[] flowerArray = { new Rose("Rose"), new Tulip("Tulip"), new SunFlower("Sunflower") };

		// unable to add index 3 to flowerarray

		// flowerArray [3] = new Rose("Rose2"); this doesnt work because arrays are fix
		// in size
		// Arrays are fixed in size

		ArrayList<Flower> flowerList = new ArrayList<>();

		flowerList.add(new Rose("Rose"));
		flowerList.add(new Tulip("Tulip"));
		flowerList.add(new SunFlower("Sunflower"));

		// can i do this

		flowerList.add(flowerArray[0]);

		System.out.println("-------- using enhanced for loop --------");
		// iterate over the list

		for (Flower flower : flowerList) {
			flower.bloom();

		}

		System.out.println("------ using indexed for loop---------");

		// using for each loop
		for (int i = 0; i < flowerList.size(); i++) {
			flowerList.get(i).bloom();

			// also can do it this way but above method does it in one line
//			Flower flower = flowerList.get(i);
//			flower.bloom();

		}

		System.out.println("----- using iterator----------");

		// using iteretor

		Iterator<Flower> fi = flowerList.iterator();
		
		while (fi.hasNext()) {

			Flower flower = fi.next();
			flower.bloom();

		}

	}

}
