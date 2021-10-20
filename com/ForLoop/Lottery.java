package com.ForLoop;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * we have a secret number (any number from 1 to 20)
		 * ask user to guess your number
		 * continue guessing a number UNTILL user enter your secret number
		 * once you guessed it say congratulation you got it
		 */
		
		Scanner in;
		int secretNumber, userNumber;
		secretNumber=15;
		
		in=new Scanner(System.in);
		
		do {
		System.out.println("Pleae guess my secret number");
		userNumber=in.nextInt();
	}while (userNumber!=secretNumber);
System.out.println("congratualition you got it");
}
}
