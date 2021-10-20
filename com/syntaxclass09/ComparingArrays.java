package com.syntaxclass09;

import java.util.Arrays;

public class ComparingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers1 = {5,4,3,2,1,0,-1};
		int[] numbers2 = {5,4,3,2,1,0,-1};
		int[] numbers3 = {1,2,3,7,7,8,1};
		
		System.out.println(numbers1==numbers2); // The result of this one will be false.
		System.out.println(Arrays.equals(numbers1, numbers2)); // so we have to compare them this way
		System.out.println(Arrays.equals(numbers1, numbers3)); // becaue the result of num1 and num3 are not equal so the result will be false.
		
		System.out.println("------------String Type Comparison----------");
		
		String[] strings1 = {"a","b","c"};
		String[] strings2 = {"a","b","c"};
		String[] strings3 = {"c","d","n"};
		
		System.out.println(strings1==strings2);
		System.out.println(Arrays.equals(strings1, strings2));
		System.out.println(Arrays.equals(strings1,strings3));
		
		System.out.println("----------------------------------");
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = new String("Hi");
		
		
		System.out.println(str1==str2);
		System.out.println(str1.equals (str2));
		System.out.println(str1.equals (str3));
		
		System.out.println("----------Using toString---------");
		
		int[] numbers = {1,2,3,4,5};
		System.out.println(Arrays.toString(numbers));
		
		String[] names = {"Masoud","Karem","Ahsan"};
		System.out.println(Arrays.toString(names));
		
		
		System.out.println("---------Two Dimensiona Array----And printing ROW BY ROW----");
		int [][] nums = {{1,2,3} , {8,9,5}};
		System.out.println(nums+" ");    // this will not work and it will only print the location.
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(nums[i][j]+" ");
				
				System.out.println("----------PRINTING COLUMN BY COLUMN-----------");
				
				int [][] num2 =  {{4,6,8},{8,2,4}};
				for (int n=0; n<3; n++) {
					for( int b=0; b<2; b++) {
						System.out.println(num2[b][n]+" ");
						
						
					}
					
				}
			}
		}
		
		System.out.println("if there is two Arrays so if we can not use (toString) we shouyld use (deepString)");
		
		int [][] integers =  {{11,12,6},{6,8,9}};
		System.out.println(Arrays.toString(integers));
		System.out.println(Arrays.deepToString(integers));
		

	}

}
