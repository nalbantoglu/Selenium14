package com.neotech.lesson13;

public class HomeWork2 {

	public static void main(String[] args) {
		

//		2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
//		Then you program should print name of the students that has A and B grade
		
		String [][] grades = {
		
		                       {"Ali", "Ahmet", "Mehmet", "Kemal"},
		                      
		                       {"A" , "B",    "A"   ,     "A"  },	
		                     };
		
		
		System.out.println(grades [0][0] + " " + grades [1][0]);
		System.out.println(grades [0][1] + " " + grades [1][1]);
		System.out.println(grades [0][3] + " " + grades [1][3]);
		
		
		// how to get length in 2D array String
		
		System.out.println(grades.length + " rows");     // how many rows 
		System.out.println(grades[0].length + " columns");  // how many columns 
		
		// create a for loop to loop only for one index
		
		for (int i = 0; i < grades[0].length; i++)
		{
		
			// i am using column 1 to get A and B grades 
			
				if (grades[1][i].equals("A") || grades[1][i].equals("B") )
				{ 
					System.out.print(grades[0][i] + " " + grades[1][i] +" ; ");
				}
				
			
		}
			
		
		
		
		
		
		
		
		
		
		

	}

}
