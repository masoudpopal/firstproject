package com.SyntaxClass5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logical not 
		
		boolean b=!true;
		boolean a=!false;
		System.out.println(b);    //false
		System.out.println(a);    //true
		
		boolean hungry=false;
		
		if(!hungry) {
			System.out.println("I am not hungry");
		}
		
		System.out.println("-----------------------");
		
		boolean hot=false;
		if(!hot) {
			System.out.println("I will go for a walk");
		}
		System.out.println("End of the class code");
		
		String name="Stephanie";
		
		if(!name.equals("Sephanie")) {
			System.out.println("Then i am not looking for you");
		}
	}

}
