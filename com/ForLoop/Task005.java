package com.ForLoop;

public class Task005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// homework #1 find the sum of odd and even numbers from 1 to 100.
		
		int even=0;
		int odd=0;
		for (int  i=1; i<=100; i++) {
			if(i%2==0) {
				even+=i;
				
			}else {
				odd+=i;	
			}
			
		}
		System.out.print("The sum of even numbers from 1 to 100 is >>>> " +even) ;
		System.out.print(" // The sum of odd numbers from 1 to 100 is >>>> " +odd);
	}
}
		
