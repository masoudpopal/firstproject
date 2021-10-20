package com.syntaxclass09;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		// Create an array of cars and store 6 elements into it. using 2 different loops print all values from the array.
		
		String[] cars= {"Toyota", "BMW", "Benz", "Honda","Lambo", "RangeRover"};
		for (int i=0;i<cars.length; i++) {
			System.out.println(cars[i]);
			for (String car:cars) {
				System.out.print(car+" ");
				System.out.println();
			}
		}
		
		// create an array of animals and store 6 elements into it using 2 different loops print all elements from the array.
		
		String[] animals= {"Monkey","Lion","Deer","Horse","Dod","Cat"};
		for (int i=0; i<animals.length;i++ ) {
			System.out.println(i+" ");
			
			}
		
		for(String animal:animals) {
			System.out.println(animal);
			System.out.println();
	
		}
		
		// Create an array to store double values and then print those in reverse order.
		double[] nums={12.2,56.4,76.89,23.9};
		for(int b=nums.length -1; b>=0; b--) {
			System.out.println(nums[b]+" ");
			
		}

	}

}
