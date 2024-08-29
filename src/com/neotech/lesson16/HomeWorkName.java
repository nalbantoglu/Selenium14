package com.neotech.lesson16;

import java.util.Scanner;

public class HomeWorkName {

	public static void main(String[] args) {

		/*
		 * Write a program that reads two parent's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: If it is a boy get
		 * half from dad and half from mom. If it is a girl get half from mom and half
		 * from dad.
		 * 
		 * Example Output: 
		 * Mom's first name? Mary Dad's first name?
		 *  Daniel Boy or Girl?
		 * boy Suggested baby name: DANRY 
		 * Example Output: 
		 * Mom's first name? Mary Dad's
		 * first name? Daniel
		 *  Boy or Girl? 
		 * girl Suggested baby name: MAIEL
		 * 
		 * 
		 * 
		 * 
		 * String substr2 = message.substring(6,8); // this will get the substring starting at index 6 and ending at index 8-1
		System.out.println("index between 6 and 8---> " + substr2);
		
		// how can i get Today from this string 
		 * 
		String substr3 = message.substring(0, 5);
		System.out.println("getting today --->: " + substr3);
		
		 */

		String dadName, momName,boyName, girlName;
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the dad");
		dadName = scan.next();
		
		System.out.println("Enter name of the mom");
		momName = scan.next();
		
		System.out.println("boy or girl? ");
		String expecting = scan.next();
				
		
		
		 boyName = dadName.substring(0, 2).concat(momName.substring(0, 3));
		
		
		//System.out.println(boyName.toUpperCase());
		
		 girlName = momName.substring(0, 2).concat(dadName.substring(0, 4));
		
		//System.out.println(girlName.toUpperCase());
		
		if (expecting.equalsIgnoreCase("Girl"))
		{
			System.out.println(girlName.toUpperCase());
		}
		else if (expecting.equalsIgnoreCase("Boy"))
		{
			System.out.println(boyName.toUpperCase());
		}
		
		
		
		
		
		
	}

}
