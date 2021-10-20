package com.ForLoop;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("  I want to print from 1 to 20  ");
		
		int a =1;
		while (a<=20) {
			System.out.println(a);
			a++;
			
		
		}
		
		System.out.println(" I want to print numbers from 100 to 150 ");
		
		int var=100;
		while (var<=150) {
			System.out.print(var+" ");
			var++;
		}
		
		
		System.out.println(" I want to print numbers from 10 to 1 ");
		
		int num=10;
		while (num>=1) {
			System.out.println(num);
			num--;
			
			
		}
		
		System.out.println(" I want to print numbers from 1 to 20 ");
		int n=1;
		
		while (n<21) {
			System.out.println(n);
			n+=2;
		}
		
		n = 1;
		
		System.out.println(" I want to print odd numbers from 1 to 20 using if statement");
		while (n<21) {
			if (n%2!=0) {
			System.out.println(n);
			
		}
			n++;
	}
System.out.println("End of the code");
}
}
