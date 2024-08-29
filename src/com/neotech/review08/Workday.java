package com.neotech.review08;

public class Workday {

	public static void main(String[] args) {
		
		
		boolean workDay = true;
		
		int day = 1;
		
		while (workDay)
			
		{
			if (day < 6)
			{
				System.out.println("I need a day off");
			}
			
			else 
			{
				System.out.println("I dont need a day off");
				
		    workDay = false; // has to have false statement to stop the code
		    
			}
			
			day++; // has to be outside of if condition but inside of while loop
			
		
			
				
			
		}
			
		
		

	}

}
