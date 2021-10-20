package com.ForLoop;

public class TaskLoop001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * This is the two method how to get odd or even numbers
		 */
		int j=2;
		while (j<=100) {
			System.out.println(j);
			j+=2;
		}
		j=20;
		while (j<=100) {
			if (j%2==0) {
				System.out.println(j+" ");
			}
			j++;
		}
	}

}
