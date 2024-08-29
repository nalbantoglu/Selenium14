package com.neotech.lesson12;

import java.util.Arrays;

public class twoD_ArrayLength {

	public static void main(String[] args) {
		
		
		
		
		String[][] months = 
			{   // this has 4 rows and 3 colums-----3 by 2 index
					{"December", "January" , "February", "Unkown"},
					{"March" , "April" , "May"},
					{"June" , "July" , "August"},
					{"Sptember" ,"October" , "November"},
				
		    };
				
		int rows = months.length;
		
		System.out.println(rows + " ---->rows");
		
		
      int cols = months.length; // this is the way to find how many rows i have
		
		System.out.println(rows + " ---->rows");
		
		
		
		// finding size of first row 
		int sizeOfFirstRow = months[0].length;
		System.out.println("the first row has " + sizeOfFirstRow    + " columns");
		
		
		System.out.println();
		
		// how do i print unkown
		System.out.println(months [0][3]);
		
		months [0][3] = "updated unkown";
		System.out.println(Arrays.toString(months [0]));
		
		
		
		

	}

}
