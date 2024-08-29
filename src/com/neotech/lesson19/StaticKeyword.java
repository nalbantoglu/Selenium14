package com.neotech.lesson19;

public class StaticKeyword {
	
	// intance variables
	String color;
	int memory ;
	
	static String brand; 
	static boolean touchscreen;
	
	
	
	void displaySpecificInfo()
	{
		System.out.println("We build " + brand + " with " +memory + "GB memory and it is " + color);
	}
	
	// static method --> static method can run directly using the class name they cannot run
	// reference the instance variable so we can only use static variables
	static void displaySpecificInfo_2()
	{                                  // static method will not accept non static value
		//System.out.println("We build " + brand + " with " +memory + "GB memory and it is " + color);
		
		System.out.println("Brand is " + brand + " and touchscreen is " + touchscreen);
	}
	
	
	

	public static void main(String[] args) {
		
		// i can accsess any static member of a class without creating an object
		// that is why is cannot contain any non static member
	
		//StaticKeyword.displaySpecificInfo_2();
		
		// i can also call it without the calssName in front because i am calling it within the 
		
		
		displaySpecificInfo_2();
		
		// i am creating local variable
		
		boolean touchscreen= true;
		
		
		// local variable changing 
		 touchscreen= false;
		 
		 // how to change instance variable 
		 //i will have to specify the static variable using the classs name
		 StaticKeyword.touchscreen= true;
		 
		 
		 // i will not need to specify using calssName if i dont have a local variable with a same name 
		 brand = "iPhone" ; 
		 
		 
		 // yes we have assigned a value to bran and touch screen;
		 displaySpecificInfo_2();
		 
		 
		 
		 // can i call  displaySpecificInfo();
		 // wee need to create an object to deal with non-static members
		// displaySpecificInfo();
		
		 StaticKeyword iPhone1 = new StaticKeyword();
		 
		iPhone1.memory= 64;
		iPhone1.color = "red";
		
		// now i can call the instance methods
		iPhone1.displaySpecificInfo();
		
		
		
	
		// can i still  call the static object
		// yes we can but it is not proper way
		iPhone1.displaySpecificInfo_2();
		
		//proper way
		StaticKeyword.displaySpecificInfo_2();
		
		
		
		
		
		
		
		
		
	}

}
