package com.SyntaxClass5;
import java.util.Scanner;
public class Task005 {

	public static void main(String[] args) {
	System.out.println("Please enter your number");
	Scanner input=new Scanner(System.in);
	
	 int num1, num2, num3, Largest;
	 
	 num1=input.nextInt();
	 num2=input.nextInt();
	 num3=input.nextInt();
	
	
	if(num1>num2 && num1>num3) {
		Largest=num1;
		
	}else if(num2>num1 && num2>num3) {
		Largest=num2;
	}else if(num3>num1 && num3>num2) {
		Largest=num3;
		System.out.println(" The largest number is the " +Largest);
		
	}

	}

}
