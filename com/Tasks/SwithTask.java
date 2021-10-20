package com.Tasks;
import java.util.Scanner;
public class SwithTask {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("please enter the 1 number");
	int num1=input.nextInt();
	
	System.out.println("Please enter the 2 number");
	int num2=input.nextInt();
	
	
	System.out.println("Please enter the operator sign");
	char operator= input.next().charAt(0);
	int result=0;
	
	switch (operator) {
	case '+':
		result=num1 + num2;
		break;
	case '-':
		result=num1 - num2;
		break;
	case '*':
		result=num1 * num2;
		break;
	case'/':
		result=num1 / num2;
		break;
		default:
			
	}
	System.out.println(" The result of operation is " + result);
	}

}
