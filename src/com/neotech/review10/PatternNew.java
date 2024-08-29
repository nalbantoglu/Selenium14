package com.neotech.review10;

public class PatternNew {

	public static void main(String[] args) {
		
		
		
		

//		for (int row = 1; row <=5; row ++)
//		{//5, 4, 3, 2, 1
//			
//			for (int col = 0; col < row; col++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		
//		for (int row = 4; row > 0; row --)
//		{//5, 4, 3, 2, 1
//			
//			for (int col = 0; col < row; col++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		
		
		for (int row = 1; row <=5; row++) // if i start with row=1 it will leave empty space on top 
		{
			
			for (int col = 0; col < row; col++)
			{
				
				System.out.print(row);
			}
			
			System.out.println();
		}
		
		//System.out.println("empty");
		
		for (int row = 4 ; row >=0; row--)
		{
			//System.out.println(row);
			
			for (int col = 0 ; col <= row ; col++) // if i make it col<row col will start with 1 les star 
				// if i make it col <= row it will be same amount of starts
				
			{
				System.out.print(row);
			}
			
			System.out.println();
		}
		
		
		
		
	
		
		
		
	}

}
