package com.syntaxclass09;

public class ArrayClasschangingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] numbers={8,9,0,6};
		int [] numbers= new int[4];
		numbers[0] = 12;  // Here we can change number 8 to 12
		numbers[1] = 9;
		numbers[2] = 0;
		numbers[3] = 6; 
		System.out.println(numbers); // in here it will just print the address of Array not the objects inside the array.
		for(int i=0; i<numbers.length; i++) {   /// in order to print the value of numbers we have to use for loop for that.
			System.out.println(numbers[i]+" ");
			
		}
		

	}

}
