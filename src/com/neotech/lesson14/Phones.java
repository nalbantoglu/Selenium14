package com.neotech.lesson14;

public class Phones {

	public static void main(String[] args) {
		
		
		
		Phone p1 = new Phone();
		
		p1.make = "Apple";
		p1.model = "Iphone 15";
		p1.color = "Space Black";
		p1.memory = 128;
	    p1.opSystem = 17.5;
	    
	    System.out.println(p1.make +" " + p1.model + ", " + p1.color + ", " + p1.memory + "GB, IOS " + p1.opSystem   );
	    
	    p1.sosCalls();
	    p1.calls();
	    p1.touchSreen();
		
		System.out.println();
		
		
		Phone p2 = new Phone();

		p2.make = "Samsung";
		p2.model = "S21 FE";
		p2.color = "Lavender";
		p2.memory = 256;
	    p2.opSystem = 9.0;
	    
	    System.out.println(p2.make +" " + p2.model + ", " + p2.color + ", " + p2.memory + "GB, Adnroid Pie " + p2.opSystem  );
	    p2.calls();
	    p2.touchSreen();
		
System.out.println();
		
		
		Phone p3 = new Phone();

		p3.make = "Nokia";
		p3.model = "C300";
		p3.color = "Blue";
		p3.memory = 32;
	    p3.opSystem = 12;
	    
	    System.out.println(p3.make +" " + p3.model + ", " + p3.color + ", " + p3.memory + "GB, Adnroid " + p3.opSystem  );
		
	    p3.calls();
	    p3.touchSreen();
	}

}
