package com.LogicallOperators006;

import java.util.Scanner;

public class Task004 {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the name of you country");
		
		String country=input.nextLine();
		
		
		if (country.equals ("USA")) {
			System.out.println("This country speaks English");;
		}else if (country.equals("Spain")) {
			System.out.println("This country speaks Spanish");
			
		}else if (country.equals("Italy")) {
			System.out.println("This country speaks Italian");
			
		}else if (country.equals("Turkey")) {
			System.out.println("This country speaks turkish");
		}
		
	
	}
}
