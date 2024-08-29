package com.neotech.review10;

public class PrintHours02 {

	public static void main(String[] args) {
		
		
		
		// print hours and minutes in digital clock
		
		
		for (int hour = 0; hour < 24; hour++)
		{
			//System.out.print(hour+ " ");
			

			for (int min = 0; min <60; min++)
				
			{
				//System.out.print(hour + " : " +min);
				
				
				if (hour < 10 && min < 10)
				{
					System.out.println("0" + hour +":0" + min);
				}
				else if (hour < 10 && min >=10)
				{
					System.out.println("0" +hour +":" + min);
				}
				else if (hour >=10 && min <10)
				{
					System.out.println(hour +":0" + min);
				}
				else 
				{
					System.out.println(hour + ":" +min);
				}
				
				
				
				
				
				
				//System.out.println(hour + ":" + min);
			}
			
			
			
		}
	
		
		
		
		
		
		
		

	}

}
