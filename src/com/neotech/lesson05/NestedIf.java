 package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) {
		
		
		
		
		
		
		//if it is morning----- good morning (outer if) 
		  // if it is school day ------ you are at school \ (inner if
	     //else not a school day -----you are at home     (inner else
		
		//else ----> not morning    ----- good afternoon (outer else)
		    // if thursaday ----> at movies if (inside last else)
	        // else i am at home
		
		boolean isMorning = false;
		boolean isSchoolDay = true;
		boolean isThursday = false;
		
		
		if (isMorning)
		{
			System.out.println("good morning");
			
		if (isSchoolDay)
		{
			System.out.println("you are at school");
		}
		else {
			System.out.println("you are at home ");
		}
			
		}
		else // not morning
		{
			System.out.println("good afternoon");
			
			if (isThursday);{
				System.out.println("i am at movies");
			}
			
			
			
				System.out.println("you are at home");
			}
		}
		
		
		
		
		
		
		
		

	}


