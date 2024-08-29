package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {
		
		
		
		int[] points = {95, 65, 84, 76, 99, 89}; // if size increases
		 
		
		// printing one by one
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);
		
		
		
		// printing easier way using for loop
		
		int size = points.length; // size will increase and loop will increase at the same time
		
		for (int i = 0; i < size; i++) // size can not be -=size because we always have -1 index
		{
			System.out.print(points [i]+ " ");
		}
		

	}

}
