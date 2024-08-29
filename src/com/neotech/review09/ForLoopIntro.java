package com.neotech.review09;

public class ForLoopIntro
{

	public static void main(String[] args) {
		
     
		// print number from 1 to 10
		//using WHILE LOOp
		
		
		int num = 1;    // in WHILE loop: initialization happens outside of WHILE loop
		
		while (num<= 10) // condition inside parenthesis 
		{
			System.out.print(num + " ");
			
			num++; // increment happens inside the LOOp
		}
		
		
		System.out.println(" ");
		System.out.println("  ============");
		
		
		//FOR LOOP
		// 1st initialization 
		// 2nd condition
		// last part increment
		
		
		// in this case i know how many times i have to iterate(run)
		
		
		
		// in FOR Loop i know exactly how many times i have to iterate
		// for such cases use FOR loop
		 // FOR LOOP 3 section      
	             //initialization        condition            increment   
		
		for (        int i = 1;           i <= 10;              i++) // semicolons required in between // no semicolon at the end because there is no more condition
		{
			System.out.print(i + " ");
		}
		
		//System.out.println(num2); // unable to print num because it is inside WHILE LOOP
		// (i) is local variable so it is created for the FOR loop and can
		//only be used inside FOR loop.. java doesn't recognize (i) outside of FOR LOOP
		
		
		
		

	}

}
