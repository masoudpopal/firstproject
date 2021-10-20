package com.SyntaxClass5;
import java.util.Scanner;
public class TaskLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your height in inches");
		
		int num=input.nextInt();
		
		if(num<60) {
			System.out.println("The person is short");
		}else if (num>60 && num<72) {
			System.out.println("The person is Medium");
		}else if (num>72) {
			System.out.println("The person is tall");
		}
	}

}
