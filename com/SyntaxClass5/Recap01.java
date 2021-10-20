package com.SyntaxClass5;

public class Recap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean understandJava=false;
		boolean enjoy=true;
		
		if (understandJava && enjoy) {
			System.out.println("That is awesome");
		}else {
			System.out.println("Please try to spend more time with java");
		}
		
		// declar a number
		// if number is smaller than 1 but bigger than 10 ----> Small
		// if number is smaller than 10 but bigger than 100----> medium
		// if number is smaller than 100 but bigger than 1000--->Large
		
		int num=1000;
		
		if (num > 0) {
			
		}
		
		if(num>1 && num<10) {
			System.out.println("Number is small");
		}else if(num>10 && num<100) {
			System.out.println("number is medium");
		}else if(num>100 && num>1000) {
			System.out.println("number is large");
		}else {
			System.out.println("Number is huge");
			
		}
			
		
	} else {
		System.out.println("Number is either 0");
		
	}

}
}
