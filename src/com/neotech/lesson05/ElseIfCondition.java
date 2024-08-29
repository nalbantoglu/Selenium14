package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		
		
		
		double d1 = 39.5;
		double d2 = 35.5;
		
		
		//d1 might be largern d2
		//d2 mihgt be larger tha d1
		// d1 and d3 are equal
		
		if (d1>d2) {
		
			System.out.println("number " + d1 + " is larger than " + d2);	
	
		}
		
		
		else if (d1<d2)
		{
			System.out.println("number " + d1 + " is larger than " + d2);
		}
		
		
		// i can list all the situations i want to identifiy
		//then at the end i can call else which would cover any other possible situation i have not considered
		
		
		
		
		
		else {  // d2==d1 which means equal
			System.out.println("number " + d2 + " is equal " + d1 );
			
		}
		  // if ... else if ....else if ...else -->is one structure 
		
		// if
		
		
		
		
		
	
		
		
		
	}

}
