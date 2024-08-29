package com.neotech.lesson19;

public class Task1 {

	/*
	Create a method that will accept an array as parameter and will return the 
	sum of all elements from that array. 
	Method should be visible only within the same package and accessible by 
	creating an instance of the class.
    Call this method from inside the class and another class in the same package.
	*/

	
	//Method details:
		//input (parameter): 	int[] array
		//output (sum of int): 	int
		//functionality: add all number in the array
		
	//Method should be visible ONLY within the same package ---> default
			//can it be protected? YES
	//accessible by	creating an instance of the class   ---> instance method (non-static)
	
	
	int sum(int[] myArray)
	{
		int sum = 0;
		
		for (int el : myArray)
		{
			sum += el;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Task1 obj = new Task1();
		
		int[] array = {25, 55, 12, 47, 95};
		
		int sum = obj.sum(array);
		
		
		System.out.println("The total sum of the array is: " + sum);

}
}
