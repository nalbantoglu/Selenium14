package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {
		

		
		
	    Dog dog1 = new Dog();
		
		dog1.name = "Mars";
		dog1.age = 1;
		//dog1.breed = "Golden";  // when breed change to golden , new value will be golden
		dog1.displayDogInfo();
		
		
		System.out.println();
		
	    Dog dog2 = new Dog();

		dog2.name = "Kofte";
		dog2.age = 2;
		dog2.breed = "Golden";
		
		
		dog2.displayDogInfo();
		
		dog1.displayDogInfo();
		
		System.out.println();
		
		 Dog dog3 = new Dog();
		 dog3.name = "Cookie";
		 dog3.age = 2;
		 dog3.displayDogInfo();
		 
		
		
		
		
		
		
		
		

	}

}
