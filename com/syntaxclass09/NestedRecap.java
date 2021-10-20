package com.syntaxclass09;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// multiplication in nested loop
		for(int a=1; a<=10; a++) {
			for(int b=1; b<=10; b++) {
				System.out.println(a+"x"+b+"="+(a*b));
			}
			System.out.println("----------------");
		}
		System.out.println("--------------24 HOUR CLOCK------------");
		for (int h=0; h<24; h++) {
			for( int m=0; m<60; m++) {
				if(h<10 && m<10) {
					System.out.println();
				}
			}
		}
		System.out.println("-------------------");

	}

}
