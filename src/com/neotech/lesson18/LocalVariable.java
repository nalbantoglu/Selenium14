package com.neotech.lesson18;

public class LocalVariable {

	public static void main(String[] args) {
		
		LocalVariable lv = new LocalVariable();
		lv.method1();

		lv.method2();
		
		
		
		
		
		
		
		
		
		
		boolean flag = true;
		// the life of the local variable flag is life of the main method
		// when main method finished execution, flag is also destroyed
		
		
		if (flag == true){  // the life time of if statement starts here
			String answer = "yes";     // local to if statement only, 
			System.out.println(answer);
			System.out.println(flag);
			
		} // the life time of if statement ends here
		
		
	//	System.out.println(answer); // not able to access this because it belongs to if statement
		
		
		System.out.println(flag); // this flag is local to main method
		System.out.println("========================");
		
		for (int i = 0 ; i < 5; i++){
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		System.out.println("========================");
		// can not use i outside of for loop. its life time ends with foor loop
		
		for (int i = 0 ; i < 3; i++){
			
			for (int j = i; j < 3; j++) {
				
				System.out.print(i + " " + j);
			}
			System.out.println(i);
			// System.out.println(j); the life time of J ended with the execution od the inner loop
		}
		
		
		
		
		
	}


               void method1()
               {
            	   String name = "Ameen";
            	   int age = 25;
            	   System.out.println(name);
            	   System.out.println(age);
               }

               
               
               
               void method2() {
            	   String name = "Elma";
            	   System.out.println(name);
               }
}
 














