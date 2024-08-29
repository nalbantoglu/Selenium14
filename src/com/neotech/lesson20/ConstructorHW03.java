package com.neotech.lesson20;

public class ConstructorHW03 {
	
	String name;
	String lastName ;
	int age;
	int weight;
	
	ConstructorHW03()
	{
		
		System.out.println("This is default Constructor ");
	}
	
	ConstructorHW03(String str)
	{
		System.out.println("This is Constructor with String --> " + str);
	}
	
//	ConstructorHW03(String str1, String str2)
//	{
//		
//		System.out.println("This is Constructor two String --> " + str1 + " " + str2);
//		
//		name = str1;
//		lastName = str2;
		
	//}
	
	ConstructorHW03(int a)
	{
		
		System.out.println("This is Constructor int --> " + (age = a));
	}
	
	ConstructorHW03(String str3, int d)
	
	
	{
		
	   
		System.out.println("This is Constructor String and int --> ");
		name = str3;
		weight = d;
	}
	
	
	

	public static void main(String[] args) {
		
//
//		Homework 3:
//			  Write program that have static constructor and observe result.
		
	
		ConstructorHW03 ct1 = new ConstructorHW03();
		
		ct1.name = "Abit";
		ct1.lastName = "Soylu";
		System.out.println(ct1.name + " " + ct1.lastName);
		
		
		System.out.println("-------------");
		
		ConstructorHW03 ct2 = new ConstructorHW03("Abit");
		
		System.out.println("------------");
		
		ConstructorHW03 ct3 = new ConstructorHW03(40);
				
		System.out.println("------------");
		
		
		ConstructorHW03 ct4 = new ConstructorHW03("Abit" , 40);
		
	
		
	}

}
