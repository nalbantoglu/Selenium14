package com.neotech.officeHour07;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
//		Given a square matrix, calculate the absolute difference between the sums of its diagonals.
		//
//			For example, the square matrix  is shown below:
		//
//			```
//			1 2 3
//			4 5 6
//			9 8 9
//			```
		//
//			The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17. Their absolute difference is |15-17| = 2

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][]
			{
					{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
					{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
					{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
					
					
					int firstDiagonalSum = 0;
					int secondDiagonalSum = 0;
					
		int result = 0;
		
		
		// first diagonal for 3x3 == [0] [0] + 11 + 22
		// second diagonal for 3x3 -- 0-2 2-2 + 2-0
		
		//[0][0] , [1][1], [2][2]..          .....[3][3]
		
		//[0][n-1] , [1][n-2], .....[n-1][0]  
		
		//[0][
		
		for (int i = 0; i < matrix.length; i++)
		{
			firstDiagonalSum += matrix[i][i];
			secondDiagonalSum += matrix[i][matrix.length-1-i];
		}
		
		result =  Math.abs( firstDiagonalSum - secondDiagonalSum);
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
 
		
		
		
		
	}

}
