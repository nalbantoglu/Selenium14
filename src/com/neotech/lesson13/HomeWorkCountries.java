package com.neotech.lesson13;

public class HomeWorkCountries {

	public static void main(String[] args) {
		
//		Create an array of countries: north America countries, south America countries, Europe countries, Asian countries, African countries. 
//		Then print all values from that array using 2 different loops and calculate how many total countries been stored.
//
		
		String [][] ulkeler = 
				
			{
					{"America", "Canada", "Mexico"},
					{"Brazil", "Guyana", "Columbia", "Chile"},
					{"Turkiye", "Bulgaristan", "Kosova", "Makedonya", "Yugoslavya"},
					{"Cin", "Hindistan", "Taiwan"},
					{"Nijerya","Libya", "Misir", "Kongo"},
			};
		 
		
		for (int i = 0; i < ulkeler.length; i++)
		{
			
			for (int j = 0; j < ulkeler[i].length; j++)
			{
				System.out.print(ulkeler[i] [j]+ ", " );
			}
			
			System.out.println();
			
		}
		System.out.println();
		System.out.println("2nd way of printing");
		System.out.println();
		

		int sum= 0;
		
		for (String [] row : ulkeler)
		{
			for (String col : row)
			{
				sum++;
				System.out.print(col + " ");
			}
			
			
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Total countries stored: " + sum);
	
	}

}
