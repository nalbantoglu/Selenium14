package com.neotech.lesson29;

import java.util.Iterator;
import java.util.LinkedList;

public class HWCardTest {

	public static void main(String[] args) {
		
         
		
		LinkedList<HWCard> card = new LinkedList<>();
		
		
		
		
		card.add(new Visa ("Chase"));
		card.add(new Visa ("Wells Fargo"));
		card.add(new Visa ("US Bank"));
		
		System.out.println("Using For loop");
		
		for (int i = 0; i< card.size(); i++)
		{
			HWCard a = card.get(i);
			
			System.out.println(a.cardType);
			System.out.println(a.limit());
			System.out.println();
			
			
		}

		System.out.println();
		System.out.println("Using For Each");
		
		
		for (HWCard c : card)
		{
			System.out.println(c.cardType);
			System.out.println(c.limit());
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Using Iterator");
		
		
		Iterator<HWCard> c = card.iterator();
		
		while (c.hasNext())
		{
			HWCard a = c.next();

			System.out.println(a.cardType);
			
			System.out.println(a.limit());
			System.out.println();
		}
		
		
		
		
		
		
	}

}
