package com.neotech.lesson31;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		
		Hashtable<Integer, String> ht = new Hashtable<>();
		

		
		ht.put(3, "Khenrab");
		ht.put(2, "Iana");
		ht.put(1, "Umut");
		ht.put(4, "Jackeline");
		
	//	ht.put(5, null); // Hashtable does not allow null value
		
		System.out.println(ht);
		
		System.out.println("Size of the hashtable is --> " + ht.size());
		
		
		// Hashtable is SYNCED, HashMap is not 
		// if anything is changed form hashtable it will be change for eneyone that is using the same object
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
