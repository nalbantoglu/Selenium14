package com.neotech.lesson12;

public class HomeWork02Grades {

	public static void main(String[] args) {
		
		
		String [][] grades = 
			{
					
					// 2 row of 3 index (0-1-2)------- and ------ 4 columns of 1 index(0-1)
					{"Ali", "Ahmet", "Mehmet", "Kemal"},
					{" D " , " B ",  " C"   , " A "  },	
			};
		
		//System.out.println(grades[0][0] + " grade is: " +grades[1][0]);
		
		//System.out.println(grades[0][1] + " grade is: " +grades[1][1]);
		
		
//		
//		String [] names = grades[0];
//		String []letterGrades = grades[1];
//		
//		
//		for (int  i= 0; i < letterGrades.length; i++)
//		{
//			String letterGrade = letterGrades[i];
//			
//			if (letterGrade.equals("A") || letterGrade.equals("B"))
//					{
//						System.out.println(names[i]);
//					}
//			
//		}
		
		String[] names = grades[0];
		String[] letterGrades = grades[1];

		for (int i = 0; i < letterGrades.length; i++) {
			String letterGrade = letterGrades[i];
			if (letterGrade.equals("A") || letterGrade.equals("B")) {
				System.out.println(names[i]);
			}
		}
		
		
		
		
		

	}

}
