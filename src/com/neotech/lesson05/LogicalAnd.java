package com.neotech.lesson05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		
		/*declare a number
		 * if number is 1-10 ----> number is small
		 * if number is 11-100 ----> number is medium
		 * if number is 101- 1000 ----> number is large
		 */
		

		int number = 1245;
		
		if (number >= 1 && number <= 10)
		{
			System.out.println(number + " is small");
		}
		
		else if (number >10 && number <= 100)
		{
			System.out.println(number + " is medium");
		}
		
		else if (number > 100 && number <= 1000)
		{
			System.out.println(number + " is large");
		}
		
		else 
		{
			System.out.println(number + "out of the range");
		}
	}

}
