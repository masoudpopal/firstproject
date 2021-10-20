package com.SyntaxThursdayReview;

import java.util.Scanner;

public class IfelseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String storedUsername="Sharif";
		String storedpassword="pass123";
		Scanner scanner= new Scanner(System.in);
		System.out.println("please enter your Username");
		String username=scanner.nextLine();
		String password= scanner.nextLine();
		System.out.println("please enter your password");
		//== operator only works with primitive date types
		// for non primitive date types we should use equals methods
		if(storedUsername.equals(username)) {
			
			System.out.println("correct username");
			
			if(storedpassword.equals(password)) {
			System.out.println("Password is also correct");
		}else {
			System.out.println("usernameis not correct but password is not");	 
		}
		
	}else {
		System.out.println("username is not correct");
		
		
	}

}
}
	
