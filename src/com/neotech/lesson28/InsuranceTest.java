package com.neotech.lesson28;

import java.util.*;

public class InsuranceTest {

	public static void main(String[] args) {
	

		
		ArrayList<Insurance> ins = new ArrayList<>();
		
		
		Car carIns = new Car("Tesla Model Y");
		Pet pIns = new Pet("Husky");
		Health hIns = new Health();
		
		ins.add(carIns);
		ins.add(pIns);
		ins.add(hIns);
		
		System.out.println("----------Using for loop------------");
		
		for(Insurance a : ins)
		{
			a.getQuote();
			a.cancelInsurance();
			
		}
		System.out.println();
		
		System.out.println("----------Using iterator------------");
		
		Iterator<Insurance> it = ins.iterator();
		
		while(it.hasNext())
		{
			Insurance i = it.next();
			
			i.getQuote();
			i.cancelInsurance();
			
				
				
				
					
		}
 		
		
	}

}
