package com.neotech.lesson21;

public class HwClassC extends HwClassB {
	
	public static void classC ()
	{
		System.out.println("This is class C");
	}
	
	
	

	public static void main(String[] args) {
		

		HwClassA first = new HwClassA();
		
		first.classA();
		
		System.out.println();
		

		HwClassB second = new HwClassB();
		
		second.classB();
		
		System.out.println();
		
		classC();
		
		
		
		
		
	}

}
