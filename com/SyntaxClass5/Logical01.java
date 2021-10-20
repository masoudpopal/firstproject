package com.SyntaxClass5;

public class Logical01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *  define a day
		 *  if day is Monday or Friday-->No class
		 *  if day is Tuesday or Wednesday
		 *  if day is Thursday-->Review class
		 */
		
		
		String day="Saturday";
		
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("We have no class at syntax");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today is manual class");
		}else if (day.equals("Thursday")) {
			System.out.println("Today is our review class");
		} else {
			System.out.println("Today is my favourite java class");
		}
		
	}

}
