package com.neotech.lesson19;

public class Task1Demo {

	public static void main(String[] args) {
		
		
		
		// accessing from the different class but same package
		
       Task1 obj = new Task1();
		
		int[] array = {25, 55, 12, 47, 95};
		
		int sum = obj.sum(array);
		
		System.out.println("The total sum of the array is: "+ sum);

		
		
	}

}
