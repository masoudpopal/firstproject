package com.Tasks;
import java.util.Scanner;
public class TaskIfstatmentAndSwith {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	System.out.println("Please enter number 1");
	int num1=input.nextInt();
	System.out.println("Please enter number 2");
	int num2=input.nextInt();
	
	System.out.println("Please enter the operator sign");
	String operator=input.next();
	int result=0;
	if (operator.equals("+")) {
		result=num1+num2;
	}else if (operator.equals("-")) {
		result=num1-num2;
	}else if (operator.equals("*")) {
		result=num1*num2;
	}else if(operator.equals("/")) {
	    result=num1/num2;
	
		
	}
	System.out.println("The result of this operation is =" +result);
	}
	
}
