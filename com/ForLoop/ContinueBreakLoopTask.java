package com.ForLoop;
import java.util.Scanner;
public class ContinueBreakLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Task 1------------------");

		for(int i=1; i<=50; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Task 2-------------------");
		String yes;
		do {
			System.out.println("Apply for credit card");
			Scanner input=new Scanner(System.in);
			yes=input.nextLine();
			if(yes.equals("yes")) {                   // if you want to ignore the upercase or lowercase (yes.equalsIgnoreCase("yes")) {
				break;
			}
		} while(!yes.equals("yes"));
			System.out.println("successful");
		}
	}


