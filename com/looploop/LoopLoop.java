package com.looploop;

public class LoopLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Nested loop - loop inside another loop
		
		for(int i=1; i<=3; i++) {
			System.out.println("I am I loop");
			for (int j=0; j<=3; j++) {
			System.out.println("I am j loop");
			}
			System.out.println("-----------------");
		}
		System.out.println("-------------------------------");
		for (int i=1; i<4; i++) {
			for (int j=1; j<3; j++) {
				System.out.println(i+" "+j);
			}
		}
	}

}
