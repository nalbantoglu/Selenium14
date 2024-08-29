package com.neotech.review10;

public class PrintHours {

	public static void main(String[] args) {

		// print combination of hours in a digital clock

		// 00:00
		// 00;01
		// ..
		// ..
		// 01:00

		// 12:00
		//

		// 23:59

		for (int hour = 0; hour < 24; hour++) 
		   {
			//System.out.print(hour + " ");

			for (int min = 0; min < 60; min++) 
				
			{
			    // System.out.println(hour + " : " + min);
			     
			     // i want to make sure that when i have single digit, i add a 0 in fort of it 
			     //1. when hour is <10 and minute < 10 i needs to ad 0 on both
			     
			     if ( hour < 10 && min < 10)
			     {
			    	 System.out.println("0"+hour + ":0" + min);
			     }
			     //2. when hourse <10 and min >=10
			     else if (hour <10 && min>=10)
			     {
			    	 System.out.println("0"+hour + ": " + min);
			     }
			     // 3. when  hour >= 10 but minutes <10
			     
			     else if (hour >=10 && min <10)
			     {
			    	 System.out.println(hour + ":0" + min);
			     }
			     
			     //4.  when both  are >= 10
			    
			     else
			     {
			    	 System.out.println(hour + ":" + min);
			     }
			     
			     
			     
			     
			     
			     
			}

			
			
			
			
			
			
			
			
		}

	}

}
