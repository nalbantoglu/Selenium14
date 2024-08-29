package com.neotech.lesson05;

public class Task {

	private static String monday;

	public static void main(String[] args) {
		
		
		
//		Write a java code: 
//	    Create a variable day (1-7).
//	    For every week day print "Today is ~the day~ and we are working "
//		 For the weekend print "We are on a break on weekend"
//		
		
	
		
		int day = 6;
		
		if (day == 1)
		{
			System.out.println("Today is monday and we are working");
		}
		else if (day ==2 ) {
			System.out.println("Today is tuesday and we are working");
		}
		else if (day ==3) {
			System.out.println("Today is wednesday and we are working");
		}
		else if (day ==4 ) {
			System.out.println("Today is thusday and we are working");
		}
		else if (day ==5 ) {
			System.out.println("Today is friday and we are working");
		}
		
		else {  // this means if day is 6 or 7
			System.out.println("we are on break");
		}
		
		// lets modify the task
		// what of the task says if it is week day print 
		// 1-5 -->today is weekday we are working 
		// 6-7 --> today is weekend and we are on a break
		
		
		if (day < 1)
		{
			System.out.println("Today is weekday and we are working");
		}
		else if (day < 6) {
			System.out.println("today is weekend and we are on a break");
			
		}
		else if (day < 8) {
			System.out.println("today is weekend and we are on a break");
		}
		else {
			System.out.println("thats not a day");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
