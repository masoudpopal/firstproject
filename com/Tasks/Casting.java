package com.Tasks;
import java.util.Scanner;
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		  
		  Scanner input=new Scanner(System.in);
		  System.out.println("Enter your name");
		  String name=input.nextLine();
		  System.out.println("Enter your mobile number");
		  String number=input.nextLine();
		  System.out.println("Enter your age");
		  int age=input.nextInt();
		  System.out.println("Your name is "+name+ " , your age is " +age+ " and your mobile number is " +number);
	}

}
