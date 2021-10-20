package com.ForLoop;
import java.util.Scanner;
public class Task006 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	// Task #2: Ask the user to pay for the candy until it is not equal to 3.
	
	
	int price=3;
	System.out.println("Please pay for the candy");
	
	do {
		
		price=input.nextInt();
	 if (price<3) {
	System.out.println("Please give more money");

	}else if (price>3) {
		System.out.println("Please give less money");
		
	}
	 
	}while (price!=3);
	System.out.println("Please enjoy your candy");
	 
	}
	
	}

	


	

