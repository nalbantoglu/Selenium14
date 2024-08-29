package com.neotech.review09;

public class Recap {

	public static void main(String[] args) {
		
		
		
		// print good morning 5 times
//		// long way of doing it. not practical
		
		
//		System.out.println("good morning");
//		System.out.println("good morning");
//		System.out.println("good morning");
//		System.out.println("good morning");
//		System.out.println("good morning");
//		
		
		// we handle code repetition using loop. we create a loop and it keeps running 
		// what do we need to create loop 
		  // how many times the codes needs to run
		    // what is the starting point
		     // what is stopping criteria
		
		int count = 1;
	
		while (count <= 5)
		{
			System.out.println("good morning");
			count++; // if i dont add increment code will run forever. this will make sure code stops 
			        //when its is reach the limit i set
			// count = count + 1; //will also work
			// count +=1; // this also increment using shorthand operator
			
		}// end of while loop
		
		System.out.println("------8------");
		
		// using DO WHILE LOOP
		
		
		
		int num =1;
		
		 // do something while  condition is true until its false
		do           // this will always run at least 1 time
		{
			System.out.println("good morning");
			num++;
		}
		while (num <= 5); // do while has to have (;) semi colon at the end of WHILE 
		{
			
		}
		
		System.out.println("------7---------");
		
		
		int m = 10;
		
		while (m < 5)   // this one will not execute due to condition is not true
		{
			System.out.println("today is good day while");
			m++;
			
		}
		
		
		System.out.println("---------9-------");
		
	//	m = 3;
		
		do  // this print at least 1 time and it will stop if WHILE is false
		{
			System.out.println("today is good day ( do while)");
			m++; // after running code once value of the m will increase to 4
			     // it will run one more time to increase value to 5 and will stop running because 5 is ==  55
			
		}
		while (m < 5);
			
		
	}

}
