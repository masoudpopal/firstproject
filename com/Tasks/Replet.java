package com.Tasks;

import java.util.Scanner;

public class Replet {

	public static void main(String[] args) {
		
          Scanner input=new Scanner(System.in);
		  System.out.println("Do you need a loan?");
		  boolean true=nextBoolean();
		  System.out.println("What is your credit score?")
		  int score=input.nextInt();
		  String eligibility;

		  if (score<600) {
		    eligilibity= "Not eligible";
		  }else if (score.equals("600") || equals("700")) {
		    eligibility = "Maybe";
		  }else if (score.equals ("701") || equals("800")) {
		    eligibility = "Eligible";
		  }else (score>800) {
		    eligibility = "Definitely elibible";
		    System.out.println("Your are" +eligibility);
		  }
		}

}

}
