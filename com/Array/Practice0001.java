package com.Array;

public class Practice0001 {

	public static void main(String[] args) {
	
		// 1. Create a 2D array of integer values.print the sum of all numbers.
		
		int[][] a= {{1,2,3},{3,4,5}};
		
		int sum=0;
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
			} 
			
			
		}
		System.out.println(sum);
		
		 
		 

	}

}
