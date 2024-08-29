package com.neotech.lesson22;

import java.util.jar.Attributes.Name;

public class Addition {
	
	// method signature void aa (int ,int)
	void add (int a, int b)
	{
		System.out.println(a + b );
	}
	
	// // method signature void aa (int ,int, int) --> method over loding by changing the number of parameteres 
	void add (int a, int b, int c)
	{
		System.out.println(a + b + c);
	
	}
	
//  // not over loading because it has same signature as above
//	//void add (int c, int d)
//	{
//		System.out.println(c + d);
//	}

	// method over loding by changing parameter types 
	void add (double a , double b)
	{
		System.out.println(a + b );
	}
	
	// void add (double double double) 
	void add (double a , double b , double c) // overloading
	{
		System.out.println(a + b + c);
	}
	
	
	
	void add (double d , int a)
	{
		System.out.println(d + a );
	}
	
	void add (int i , double d )
	{
		System.out.println (i + d );
	}
	
	void add(String str, int i)
	{
		System.out.println("can not add them");
	}
	
	void add(int i, String str)
	{
		System.out.println("still can not add them");
	}
	
	
	
}
