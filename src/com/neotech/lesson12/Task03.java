package com.neotech.lesson12;

public class Task03 {

	public static void main(String[] args) {
//		Create an array of countries.
//		While retrieving all values from an array print capital for each country.
//				(use 2 different loops).
		
		
		
		String[] ulke = {"Morocco","USA","Turkiye", "Senegal", "Qatar"};
		
		//indexed loop regular loop
		
		for (int i = 0; i < ulke.length; i++)
		{
			if (ulke[i].equals("Morocco"))
			{
				System.out.println(ulke[i]+ " - rabat");
			}
			else if(ulke[i].equals("USA"))
			{
				System.out.println(ulke[i]+ " - Washintong DC");
				
			}
			else if(ulke[i].equals("Turkiye"))
			{
				System.out.println(ulke[i]+ " - Ankara");
				
			}
			else if(ulke[i].equals("Senegal"))
			{
				System.out.println(ulke[i]+ " - dakar ");
				
			}
			else if(ulke[i].equals("Qatar"))
			{
				System.out.println(ulke[i]+ " - doha");
				
			} 
			else 
			{
				System.out.println("invalid");
			}
			
			System.out.println();
			
			
		}
		System.out.println("======================");
			
			
			
			
			//enhaced for loop
			
			for (String ulkeler : ulke)
			{
				if (ulkeler.equals("Morocco"))
				{
					System.out.println(ulkeler + " - rabat");
				}
				else if(ulkeler.equals("USA"))
				{
					System.out.println(ulkeler+ " - Washintong DC");
					
				}
				else if(ulkeler.equals("Turkiye"))
				{
					System.out.println(ulkeler+ " - Ankara");
					
				}
				else if(ulkeler.equals("Senegal"))
				{
					System.out.println(ulkeler+ " - dakar ");
					
				}
				else if(ulkeler.equals("Qatar"))
				{
					System.out.println(ulkeler+ " - doha");
					
				} 
				else 
				{
					System.out.println("invalid");
				}
			}
		
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
