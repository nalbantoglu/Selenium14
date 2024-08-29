package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {
		
		
		int a = 5; // int is a primitive data type
		
		// 1st way we used to create string----> String literal
		String name = "Sabah";
		// this was java will use String pool 
		
		
		//2nd way to create a string --- using NEW keyword
		String name2 = new String("Sarah"); //using new keyword
		
		// in this way JVM is forced to create new String reference everytime
		
		
		int size = name.length();
		// when i say name ---> trying to access something on the string class
		System.out.println("the length of the name is: " + size); // calculating size of the size
				
		String school = "Neotech";
		
		System.out.println("the length of the school name is: " + school.length());
		
        String school2 = "        Neotech          "; // java will count spaces also
		
		System.out.println("the length of the school2 name is: " + school2.length());
		
		
		String city = "New York";
		String lowerCaseCity = city.toLowerCase();
		System.out.println(lowerCaseCity); 
		
		System.out.println(city.toUpperCase());
		
		System.out.println(city); //String object are immutable -- it will not change
		
		city = "New York City"; // this is new String i did not change new york to nyc
		
		String newCity = "New York"; // this is not a new string it existed in the pool like 34
		
		String sentence = "The size of " + school + " is " + school.length();
		
		System.out.println(sentence);
		
		
		String firstName = "Neha";
		String lastName = "Dotiya";
		
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		String fullName2 = firstName.concat(lastName);
		System.out.println(fullName2);
		
		// what if i wanted to add scape in between
		
		String nameWithSpace = firstName + " " + lastName;
		System.out.println(nameWithSpace);
		
		String nameWithSpace2 = firstName.concat(" ").concat(lastName);  // method chaining
		
		
	String methodChaining =	firstName.concat(" ").concat(lastName).concat(" ").concat(school).toUpperCase();
		System.out.println(methodChaining);
		
	
		
	
		String str = " ";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		
		String str2 = "         Today is tuesday and        we are "
				+ "learning  some cool       stuff      !!!!!     .     ";
		
		System.out.println(str2.trim()); // trimming emplty spaces 
		
		System.out.println("Length of str2 is : " + str2.length());
		
		System.out.println("Length of str2 is : " + str2.trim().length());
		
		
		int [] num = { 1, 2, 3, 4};
		
		System.out.println("The array length is : " + num.length);
		
		
		
	}

}
