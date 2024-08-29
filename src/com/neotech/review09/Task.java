package com.neotech.review09;

public class Task {

	public static void main(String[] args) {
		
		
		//print number from 1 to 100
		for (int i = 1 ; i<= 100; i += 1 ) //   i use i++ or i+=1
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n --------- ");
		
		
		//print number from 100 to 11
		for ( int i = 100; i >= 1; i-=1)
		{
			System.out.print(i +  " ");
		}
		
		System.out.println("\n ---------");
		
		// print even number from 20 to 1 (2 ways)
		
		for ( int i = 20 ; i >=1 ; i = i-2 )
		{
			System.out.print(i + " " );
			
		}
		
		
		System.out.println(" \n --- " );
       //2nd way
		 for ( int i = 20; i>=1; i--)
		 {
			 if ( i % 2 == 0)
			 System.out.print(i + " ");
		 }
		 System.out.println(" \n --- " );
		 
		 // print odd number between 20 and 50( 2 ways)
		 
		 for (int i = 20; i <=50; i+=2)
		 {
			 System.out.print(i + " " );
		 }
		 System.out.println(" \n 2nd way even numbers " );
		 //2nd way
		 
		 for (int i = 20; i<= 50; i = i+2)
		 {
			 if ( i % 2 ==0)
				 System.out.print(i + " ");
		 }
		 
		
		
		
		
		
		
	}

}
