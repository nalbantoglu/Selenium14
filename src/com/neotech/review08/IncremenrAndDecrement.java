package com.neotech.review08;

public class IncremenrAndDecrement {

	public static void main(String[] args) {
		
		
		// ++ increment
		// -- decrement
		
		// ++y pre increment
		// --y pre increment
		
		// increment will always increase the value of a variable by 1
		  //decrement will always decrease the value of a variable by 1
		/*
		 * Possible usages
		 * -- > ++a before i use a increase its value by 1
		 * --> a++  use a than increase value by 1
		 * --> --a  decrease value  by 1 before using a 
		 * --> a-- use a than decrease its value by 1
		 */
		
		
		
		int x = 5;
		System.out.println(x);
		
		x = x +1;    // updating value of x by adding 1 to it
		System.out.println(x);
		
       x +=1; // adding value using shorthand operators
       
       System.out.println(x);
       
       
       x++ ; // post-increment  --  ad 1 to x
       System.out.println(x);
       
       
       x-- ; // post decrementing -- subtract 1 from x
       
       System.out.println(x);
       
       
       int y = 10;
       
       System.out.println(y++); // there are two things happening here
       // 1st action is printing and 2nd action is incrementing 
       
       System.out.println("=======");
       
       
       int z = 10;
       int w = z++;
       
       System.out.println(z); // prints the incremented value
       System.out.println(w);// prints the value and adds 1
       
       
       
       
       
       
       
       
	}

}
