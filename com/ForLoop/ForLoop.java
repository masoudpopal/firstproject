package com.ForLoop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * if you want to print some many copy of "I love Allah" you can use loop
		 */
		for (int  i =  0; i<4; i++) {
			
			
			System.out.println("I love Allah");
			
		}
		
		/*
		 * if you print (i) it will print 0 to 9 including 0 it is 10 digits 
		 * if you print 10 digits including 0 then you should say (i<=10).
		 */
		
		for (int i = 0; i<=10; i++) {
			System.out.println(i);
		}
		
		/*
		 * if you want to print all the values or length you can also use loop
		 */
		int [] Grades= {80,90,95,98,99,100};
		for (int i = 0; i < Grades.length; i++) {
		System.out.println(Grades [i]);
		
	}

}
}
