package com.neotech.lesson12;

import java.util.Arrays;

public class TwoD_Arrays {

	public static void main(String[] args) {
		

		
		// 1 2 3 4
		// 5 6 7 8
		
		int [][] numbers = new int [2][4];
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		
		
		// let initialize the value of the first row
		
		numbers[0][0] = 10; // row 0 ---- col 0
		numbers[0][1] = 15;  // row 0 ---- col 1
		numbers[0][2] = 20;  // row 0 ---- col 2
		numbers[0][3] = 25;  // row 0 ---- col 3
		
        //2nd row
		numbers[1][0] = 30;  // row 1 ---- col 0
		numbers[1][1] = 35;  // row 1 ---- col 1
		numbers[1][2] = 40;  // row 1 ---- col 2
		numbers[1][3] = 45;  // row 1 ---- col 3
		
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		
		
		// how do i print 40?
		System.out.println(numbers[1][2]);
		
		// printing 25
		System.out.println(numbers[0][3]);
		
		System.out.println("---------------------");
		
		
		int [][] nums = // initialize and assigning value at the same time
		{	
				
				
				// 4 colums
	         	{1, 2, 3, 4},  // 3 rows
				{5, 6, 7, 8},
				{9,10,11,12}	
		};	
				
		System.out.println("how can i print 12?");
		System.out.println(nums[2][3]);
		
		System.out.println();
				
				
		// lets change the value of 7 to 13
		
		nums [1][2]= 13;
		System.out.println(nums [1][2]);
				
				
		System.out.println(Arrays.toString(nums[1])); // if i need to print 
		
		
		 
		  
		
		
		
	}

}
