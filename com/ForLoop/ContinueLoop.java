package com.ForLoop;

public class ContinueLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=0; i<=3; i++) {
			if (i==1) {
				continue;   // it will escape the 1 and print 0,2,3
			}
			System.out.println("I am inside the loop");
			System.out.println(i);
			
		}
		
		// I want to print all the numbers from 1 to 10 except number 5
		for(int i=1; i<=10; i++) {
			//if(i==5) {
			if(i==5 || i==9) {       // if you want to escape two numbers
				
				continue;
			}
			System.out.println(i+" ");
		}
	}

}
