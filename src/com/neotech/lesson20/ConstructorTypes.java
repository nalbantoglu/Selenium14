package com.neotech.lesson20;

public class ConstructorTypes {
	
		String name;
		int age;
		
		
		// default constructor
		// no return type
		// must have the same name as class name 
		// no parameters
		
		ConstructorTypes()
		{
			System.out.println("I am the default constructor");
			
		
		}
	
	// we may have several constructor methods
		// with different signatures
		
		ConstructorTypes(String str) 
		{
			
			System.out.println("I am a constructor with a string: " + str);
			
    	}
		
		
		ConstructorTypes(int num)

		{
			System.out.println("I am a constructor with an int: " + num);
		}
		
		ConstructorTypes(double dbl)

		{
			System.out.println("I am a constructor with a double: " + dbl);
		}
	
		ConstructorTypes(String str, int num)

		{
			
			System.out.println("I am a constructor with a string and an int: " + str + " " + num);
			name = str;
			age= num;
		}
		
		ConstructorTypes(String str, String str1)

		{
			System.out.println("I am a constructor with two string: " + str + " " + str1 );
			name = str;
			name = str1;
			
		}
	
		
		
	public static void main(String[] args) {
		

		// using the constructors
		
		ConstructorTypes ct1 = new ConstructorTypes();
		
		ct1.name = "Abeera";
		ct1.age = 25;
		
		System.out.println(ct1.name + " " + ct1.age);
		System.out.println(" ");
		
		// constructing with string 
		ConstructorTypes ct2 = new ConstructorTypes("Khenrab");
		
		System.out.println(ct2.name);
		
		System.out.println(" ");
		
		ConstructorTypes ct3 = new ConstructorTypes("tima" , 26); // calling an object with string and int
		System.out.println(ct3.name);
		System.out.println(ct3.age);
		//ConstructorTypes ct3 = new ConstructorTypes("tima" , "Jennifer" , "Paul"); this wont work because we dont have 3 string constructor
		
		System.out.println(" ");
		
		ConstructorTypes ct4 = new ConstructorTypes("Abit" , "Farzana");
		
		
	}

}
