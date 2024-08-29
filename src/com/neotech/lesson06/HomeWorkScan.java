package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWorkScan {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Please enter your height");
		int height = input.nextInt();
	    
		
		if( height < 60)	
		{
			System.out.println("You are short");
		}
		else if (height >=60 && height <72)
		{
			System.out.println("You are medium");
		}
		
		else 
		{
			System.out.println("You are tall");
		}
	}

}
