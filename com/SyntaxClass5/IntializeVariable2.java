package com.SyntaxClass5;

import java.util.Scanner;

public class IntializeVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ask user to enter 3 numbers
		 * then find the largest
		 */
		
		Scanner scan;
		int num1, num2, num3, Largest;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		 num3=scan.nextInt();
		
		 if(num1>num2 &&  num1>num3) {
			 Largest=num1;
		 } else if (num2>num1 && num2>num3) {
			 Largest=num2;
		 }else {
			 Largest=num3;	
	}
      System.out.println("The largest number"+Largest);
      
      // lets identify if Largest is even or odd
      
      if (Largest%2!=0) {
    	  System.out.println(Largest+" number is odd");  
      }else {
    	  System.out.println(Largest+ " number is even");
      }
    }

	}


