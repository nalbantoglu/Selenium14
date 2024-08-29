package com.neotech.lesson29;

import java.util.*;

public class Task01 {

	public static void main(String[] args) {
		

		
		List<String> names = new ArrayList<>();
		
		
		names.add("Abeera");
		names.add("Iana");
		names.add("Iana");
		names.add("Nargiza");
		names.add("Ebru");
		names.add("Abeera");
		
		System.out.println(names);
		
		//LinkedHashSet -- no dublicate, keeo the insertion order
		
		Set<String> lhs = new LinkedHashSet<>();
		
		lhs.addAll(names);
		
		System.out.println(lhs);
		
		
		//HashSEt 
		
		Set<String> hs = new HashSet<>(names);
		
		System.out.println(hs);
		
		
		//TreeSet
		
		Set<String> ts = new TreeSet<>();
		
		ts.addAll(names);
		
		System.out.println(ts);
		
		
		// how can i check if an element exists in a set
		
		if(lhs.contains("Abeera"))
		{
			System.out.println("Contains Abeera");
		}
		
		// hiow can i access a specific element of the set 
		
		List<String> list = new ArrayList<>(ts);
		list.add(1, "Preethi");
		System.out.println(list);
		
		// get an element index 3
		System.out.println(list.get(3));
		
		
		// can i convert the set to an array
		
    	Object[] array =	lhs.toArray();
		
    	System.out.println();
    	System.out.println(Arrays.toString(array));
    	

    	System.out.println();
    	Arrays.sort(array);
    	System.out.println(Arrays.toString(array));
    	
    	System.out.println(list);
    	Collections.sort(list);
    	System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
