package com.neotech.review08;

public class PreAndPostIncrement {

	public static void main(String[] args) {
	
		/*
		 * ++a
		 * --a
		 * 
		 * a++
		 * a--
		 */
		
		int x;
		int y = 20;
		
		x = y++;
		// post increment
		    // 1. perform action ----assing the value of y to x
		     //2. apply the increment --increase the value of y by 1
		 
		// this is how line would look in two line
//		x=y;
//		y +=1;
	
		
		System.out.println(x);
		System.out.println(y);
		
		
		int a;
		int b = 10;
		
		a= ++b;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		int c;
		int d = 5;
		
		c = d--;
		
		
		System.out.println(c);
		System.out.println(d);
		
		
		int e;
		int f = 8;
		
		e= --f;
		System.out.println(e);
		System.out.println(f);
		

		System.out.println("========");
		
		
		int num = 10;
		
		System.out.println(num);

		System.out.println(num++);

		System.out.println(num);
		

		System.out.println(++num);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
