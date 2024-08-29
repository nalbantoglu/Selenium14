package com.neotech.lesson24;

public class ComputerTest {

	public static void main(String[] args) {
	

		
		Apple apple = new Apple("Apple");
		
		HP hp = new HP("HP","Black");
		
		
		
		
		
		
		// arrays can olny holds emelements of same type
				
		int [] intArrays = {1, 3,4,5,6};
		
		Computer c1= new Dell("Dell");
		Computer c2= new Dell("Lenova");
		
		// one way of storing computer object in array
		Computer [] compArray = {c1,c2, new Apple("Apple")};
		
		// second way of doing it 
		Computer [] compArray2 = {new Apple("Apple"), new Dell("Dell"), new HP("HP","Black"), new Lenovo("Lenova")};
		
		
		for (Computer comp : compArray2)
		{
			System.out.println("Brand is " + comp.brand);
			comp.run();
			
			
			// this wont work because we upcated everting into computer class
			//comp.safe()
			// comp.save()
			
			System.out.println();
		}
		Apple[] appArray = { new Apple("Apple1"),new Apple("Apple2"), apple};
		
		
		
		
		
	}

}
