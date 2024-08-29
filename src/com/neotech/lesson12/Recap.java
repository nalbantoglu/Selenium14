package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {

		
		
		int [] grades = new int [5]; // naming and giving size of 5. default is 0 it has 5 container but starts from 0.
		// [ 0, 0, 0, 0 ,0] default array 
		
		
		System.out.println("size of this array is: " + grades.length);
		
		System.out.println("grades with index 2 is: " + grades[2]); // which is mean second container
		
		System.out.println("second grade in my array is: " + grades[1]); 
		
		
		
		// 0  1  2  3  4 
		//[0 ,0, 0, 0, 0]
		grades [3] = 90;
		
		// 0  1  2  3  4 
	    //[0 ,0, 0, 90, 0]

		System.out.println(grades[3]);
		
		//grades [5] = 100; we dont have 5th element--- out of bounds exception
		
		
		//grades[0] = "paul"; can not store string in int array
		
		grades [2] = 100;
		
		System.out.println("grades number 2 is :"+ grades[2]);
		
		
		grades [4] = 95;
		grades [1] = 85;
		grades [0] = 80;
		
		System.out.println("grades index 4 is :"+ grades[4]);
		
		
		// 1st way of finding sum of grades
		
		int total = grades [0] +  grades [1] +  grades [2] +  grades [3] +  grades [4] ;
		System.out.println("sum of all grades is: " + total);
		
		int avg = total/ 5;
		System.out.println("avarage of all grades is: " +avg);
		
		
		
		System.out.println("------------------------------------2nd way of doing sum and avarage--");
		
		// length is use to get size of the container
		
		//2nd way of doing it sum
		
		int sum = 0;  // i need for loop top get sum of all grades
		
		for (int i = 0; i < grades.length; i++) // this will assure that loop will run as many as grades size 
			// not good idea to hard code size of the array
		{
			sum += grades[i]; // every time loop runs grade will take numbers and add it to sum
			
			
		}
		System.out.println("sum of all grades and avarage is : " +sum);
		System.out.println(" avarage of all grades is : " +sum / grades.length);
		
		
		System.out.println("------ ------------------string arrays");
		
		
		String[] cities = {"boston", "istanbul", "madrid", "beyrut", "chicago", "paris"};
		
		// string array has to be in curly brackets {   } 
		
		System.out.println("the length of array cities: "+ cities.length );
		
		int lastIndex = cities.length - 1; // lastindex is variable i can use to find last city on the string
		System.out.println("last city is: " + cities[lastIndex]); // this will  print last city in the index 
		
		System.out.println("------------");
		// how do i print city names on the console using loops
		
		for (int i = 0; i < cities.length; i++) //i will run up to cities length until runs out
		{
			System.out.print(cities[i] + ","); // i will give the items that i need 
		}
		

		System.out.println("------------");

		System.out.println("------------");
		
		// how do i print city name in reverse order
		
		for (int i = lastIndex; i >=0; i--) // i used last index to start printing in reverse, because last index is set value 
		{      // i could make i=6 which starts from 6 and count down to 0
			System.out.print(cities[i] + ",");
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
