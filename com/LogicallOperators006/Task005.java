package com.LogicallOperators006;
import java.util.Scanner;
public class Task005 {

	public static void main(String[] args) {
	
	
	Scanner input;
	String grade;
	String Student;
	input=new Scanner(System.in);
	System.out.println("Please enter your grade");
    grade=input.nextLine();
    Student=input.nextLine();
	
	if (grade.equals("A")) {
		Student= "Excellent";
	}else if (grade.equals("B")) {
		Student= "Good";
	}else if (grade.equals("C")) {
		Student= "Average";
	}else if (grade.equals("D")) {
		Student="Bad";
	}else {
		Student="Not Acceptable";
		System.out.println("You are" +Student);
		
	}

	}

}
