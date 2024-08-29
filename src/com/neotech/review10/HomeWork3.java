package com.neotech.review10;

public class HomeWork3 {

	public static void main(String[] args) {
		
		
		//Print numbers from 1 to 50 except those that are divisible by 3.
		

		
		
		
		
		
		
		
		int num =1;
		
		while(num <= 50)
		{
			if (num % 3 != 0)
			{ 
				System.out.print(num + " ");
			}
			num++;	
		}
		
		
		
		
		int i = 50;
		
		do 
		{
			if (i % 3 == 0)
			{
				i++;
				continue;
				
			}
			
			System.out.print(i + " ");
			i++;
			
		}
		while (i<= 50 );
			{
			System.out.println();
		}
		
		//FOR LOOP
		
	
       
		for (int j = 1; j<=50 ; j++)
		
		{
			if (j % 3 == 0)
				continue;
		
		System.out.print(j + " ");
		}
		
	}

}
