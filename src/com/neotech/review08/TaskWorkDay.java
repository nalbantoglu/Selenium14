package com.neotech.review08;

public class TaskWorkDay {

	public static void main(String[] args) {
		
		
		
		
		boolean workDay = true ;
		int day = 1 ;

		
		while(workDay) // day <7 
		{
			if (day < 6)
			{
				System.out.println("i need a day off");
			}
			
			else 
			{
				System.out.println("i dont need day off anymore");
				workDay = false; // this has to be inside iff condition so run can stop
			}
			day++; // has to be inside while loop but outside of if condition
		}
		
		
	}

}
