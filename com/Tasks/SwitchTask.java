package com.Tasks;
import java.util.Scanner;
public class SwitchTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Enter two numbers");
		Scanner Scanner=new Scanner(System.in);
		double number1=Scanner.nextDouble();
		double number2=Scanner.nextDouble();
		System.out.println("Enter the operation");
		char operation=Scanner.next().charAt(0);
		if (operation=='+') {
			System.out.println(number1+number2);
		}else if(operation=='-') {
		System.out.println(number1-number2);
	}else if(operation=='*') {
		System.out.println(number1*number2);
		
	}else if(operation=='/') {
		System.out.println(number1/number2);
}else {
	System.out.println("operation not supported");
}
switch (operation){	
case '+':
	System.out.println(number1+number2);
	break;
case '-':
	System.out.println(number1-number2);
	break;
case '*':
	System.out.println(number1*number2);
	break;
case '/':
	System.out.println(number1/number2);
	break;
	default:
		System.out.println("operation not supported");
}
		
		
		
		
}
}
