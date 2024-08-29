package com.neotech.lesson17;

public class HomeWorkExtra {
	

    String reverseString(String input)
    {
  	  char[] charArray = input.toCharArray();
  	  String reversedStr = "";
  	  
  	  for (int i = charArray.length -1 ; i>=0 ; i-- )
  	  {
  		  reversedStr += charArray[i];
  		  
  	  }
  	  return reversedStr; 
    }

	public static void main(String[] args) {
		
		System.out.println("Attempting to reverse this sentence word by word");
		
		// Write a java program to reverse String? Reverse a string word by word?
		HomeWorkExtra extra = new HomeWorkExtra();
		
		 String sentence = "Attempting to reverse this sentence word by word";
         
         // splitting sentence in string arrays using split method
         String[] words = sentence.split(" ");
		
		
		 for (String word : words)
		 {
			 
			 
		//	StringBuffer strBuffer = new StringBuffer(word);
		//	System.out.print(strBuffer.reverse() + " ");
			 
			 
			 
			 // "2nd way of doing it by building my orn method " + 
			 System.out.print(extra.reverseString(word)+ " ");
			 
			 
		 }
		 System.out.println();
		
		
		
		
	}

}
