package com.neotech.lesson23;

public class CreditCardTest {

	public static void main(String[] args) {
		

		CrediCard c1 = new CrediCard(1500);
		
		c1.calcInterest();
		
		CrediCard v = new Visa(1200);		
		
		v.calcInterest();
		

		CrediCard ax = new Ax(2300);
		
			ax.calcInterest();
	}

}
