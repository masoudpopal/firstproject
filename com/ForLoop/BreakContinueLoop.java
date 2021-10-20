package com.ForLoop;

public class BreakContinueLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1; i<6; i++) {
			System.out.println("Today is Sunday");
			//break;
		}
		
		boolean summer=true;
		int temp=80
				;
		while(summer) {
			System.out.println("I love summer");
			//break;
			if(temp>95) {
				System.out.println("I don't love it anymore");
				break;
			}
			//temp++;
			temp+=2;
		}
	}

}
