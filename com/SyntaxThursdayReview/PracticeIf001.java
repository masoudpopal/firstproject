package com.SyntaxThursdayReview;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		int num = inp.nextInt();

		if (num > 18) {
			System.out.println(num + " You are eligible to vote");

		}
		if (num < 18) {
			System.out.println(num + " You are not eligible to vote");

		}
	}
}