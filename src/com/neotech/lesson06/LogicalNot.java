package com.neotech.lesson06;

public class LogicalNot {

	public static void main(String[] args) {
		
		
		//  ! Not operators it will reverse value of  boolean 
		 // != ----> mean not equal 
		
		
		boolean b1 = !true; // this mean not true ----> false
		
		System.out.println(b1);
		
		boolean b2 = !false; //// it means not false ----- true
		System.out.println(b2);
		
		// negate an exprassion that produces boolean
		System.out.println(!(6 < 4));

		
		
		System.out.println("=======");
		boolean isCold = !true;
		
		if (!isCold)
		{
			System.out.println("its hot");
		}
		
		int x = 13;
		
		if (x == 12)
		{
			System.out.println("x is 12");
		
		}
		else 
		{
			System.out.println("x is not 12");
		}
		
		if (x != 12)
		{
			System.out.println("x is not 12");
		}
		
		
		System.out.println(!(x == 12));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
