package com.neotech.lesson20;

import java.util.Scanner;

public class HomeWork1 {
	

	// return type: STring
	// method name: getVowels
	// parameters: String
	// available only inside this class: private
	// executed by calling its name: static
	
	private static String getVowels (String str)
	{
		// what do i do here?
		// replace every character that is not vovels with empty string("")
		// lets use regilar expressions here: []
		
		String result = str.replaceAll("[^aeuioAEUIO]", " ");
		
		
		return result ;
		
		//return str.replaceAll("[^aeuioAEUIO", " ");  i can also use this 
	}
	

	public static void main(String[] args) {
		
		
		// lets get the string from the user
		
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		String onlyVowels = getVowels(str);
		
		System.out.println(onlyVowels);
		
		// how can i access this method if it wan not static
		// i must create object to call it 
		
		
	//	HomeWork1 hw1 = new HomeWork1();
		
		// hw1.getVowels(str);
		
		
		
		
		
		
		
		


	}

}
