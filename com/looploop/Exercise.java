package com.looploop;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		System.out.println(++x+(++x)); // 11+12=23
		
		int y=10;
		System.out.println(y+++(y++));  //(y++) will be incremented to 11 then use the value of y then increment it 
		//System.out.println(y++  +  y++);   // this is like above the same thing 
		System.out.println(y);
	}

}
