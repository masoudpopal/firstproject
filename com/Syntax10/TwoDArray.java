package com.Syntax10;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int[] b;
		
		int [][] c=new int [3][4];
		for(a=0; a<3; a++) {
			for(int j=0; j<4; j++) {
				System.out.println(c[a][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("-----another way of creating a 2D array-----");
		int [][] myArray= {
				{11,12,13,14,15},
				{20,30,40,},
				{100,200,300,400},
		};
		System.out.println(myArray[0][4]);
		System.out.println(myArray[1][0]);
		
		}

	}


