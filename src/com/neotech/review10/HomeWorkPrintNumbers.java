package com.neotech.review10;

import java.util.Scanner;

public class HomeWorkPrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = scanner.nextInt();
	        
	        // First part
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        
	        // Second part
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
