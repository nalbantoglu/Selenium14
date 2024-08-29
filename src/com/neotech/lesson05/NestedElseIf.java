package com.neotech.lesson05;

public class NestedElseIf {

	public static void main(String[] args) {
		
		/*
		 * write the program if the student has compleated quiz
		 * if the studenr did the quiz then check score and give these evaluation
		 * if the score is 90or above then print "A great job
		 * if the score is 89 to 90, print "B well done
		 * if score is 70 to 80, print "C you passed
		 * otherwise print "you failed
		 */
	 
		// if quiz is done
		  //if score is >=90  --> A
		  // if score is >=80 --> B well done
		  //...
		  //..
		  
		
		
		
		
		boolean quizIsDone = true;
		int score = 85;
	
		
		
		if (quizIsDone)
		{
			if (score >= 90) {
				System.out.println("A, Greatjob!");
			}
			else if (score >= 80)
			{
				System.out.println("B, well done");
			}
			
			else if (score >= 70)
			{
				System.out.println("C, you passed");
			}
			
			else
			{
				System.out.println("try harder next time");
			}
			
		}
		
		else // quiz not done
		{
			System.out.println("you did not do the quiz. you failed");
		}
		
		
		
		
		

	}

}
