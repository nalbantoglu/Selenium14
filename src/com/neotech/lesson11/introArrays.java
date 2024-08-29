package com.neotech.lesson11;

public class introArrays {

	public static void main(String[] args) {
		
		// array must have [ ] brackets 
		
		
		// declare and assing an int
		
		int num= 10;
		int num2= 20 ; 
		int num3 = 30; 
		
		// what if i have way the group all of the same type variables together
		
		//1st way
		int[] array1 = new int [ 5 ]; // we declare an array and we gave it length of 5
		
		// this is the current state of array1 = [] [] [] [] [] by default value is 0
		
		// the size is fixed once i said in line 17 that the size is 5 it will not change
		
		
		
		// the number we use to access element is an array is called index
		System.out.println(array1[1]); // 0 by default 
		
		
		// how do we reassign a value on arrays
		// i have to assign the value on the specific index
		               //  0  1  2  3
		array1[0]= 5; //  [5] [] [] [] []value of the 0 became 5  // index always starts with 0
		
		array1[1] = 10;  // [5] [10] [0] [0] [0]
		
		array1[2] = 15;   //[5] [10] [15] 0[] [0]
		
		array1[4] = 25;  //[5] [10] [15] [0] [25]
			
	    array1[3] = 20;  //[5] [10] [15] [20] [25]		
				
		
	    
	    //2nd way
	    
	    int[] array2; // not assigning index size 
	    
	    array2 = new int[3]; // 3 element with index 0 , 1 , 2 size will always be size -1. because array starts at 0
	    
	    array2[2] = 10; // assigning a value to index 2
	    
	   // array2 [3] = 15; // no more spots  we only have 3 == 0 - 1 - 2 this will give an error. array index out of bound
	    
	    
	  //int[] array1 = new int [ 5 ];  same way just different type
	  String[] srtArray = new String[2]; /// this is string array new type and size  
	  
	  // java will always assign null on string at first
	 
	// assigning a value
	 srtArray[1]= "new york";
	 srtArray[0]= "London";
	// srtArray[2] = "Ankara"; // java will not complain until i run it . i dont have room for 2 index 
	 
	  srtArray[1]= "new jersey"; // Reassigning a value
	  
	  
	  
	    
	    System.out.println(srtArray[1]);
	    
	    
	    char[] letters = new char[6]; // only 6 index 0 to 5
	    
	    letters[0] = 'A';
	    letters[1] = 'B';
	    letters[2] = 'C';
	    letters[3] = 'D';
	    letters[4] = 'E';
	    letters[5] = 'F';
	    
	    
	    
	    System.out.println(" the letter at index 5 is : " + letters[5]);
	    
	    
	  //2nd way of doing arrays
	  		char[] grades2 = { 'A', 'B', 'C', 'D', 'E', 'F'}; // using curly bracket i can give value inside of it 
	  		                                                  // java know how many values i have inside the curly
	  		
	  		// once create this way i can not add anymore index
	  		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
