package com.syntaxclass09;

public class ExerciseFor2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Write a program that prints the sum of each row in a 2D.
		 * Resolve the exercise and print the sum of each columns.
		 */
		
		int[][] integers = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<4; j++) {
				sum += integers[i][j];
				System.out.println("The sum of row "+ (i+1) + ":" + sum);
			}
		}
		// Write a program that prints the maximum of each row in a 2D array.
		
		int[][] integers1 = {
				{4,5,8},
				{9,11,15},
				{5,7,1}
		};
		
		for(int i=0; i<3; i++) {
			int max = integers1[i][0];
			for (int j=1; j<4; j++) {
				max = (integers1[i][j] > max)? integers [i][j] :max;
				System.out.println("row"+(i+1)+ ":" + max);
			}
		}
		
		}
		


}

	



