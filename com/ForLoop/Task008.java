package com.ForLoop;
import java.util.Scanner;
public class Task008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter a number from 1 to 20");
		Scanner input=new Scanner(System.in);
		int even=0;
		int odd=0;
		int range=0;
		
		 range=input.nextInt();
		for(int i=1; i<=20; i++ ) {
			if(1%2==0) {
				even+=1;
			}else {
				odd+=i;
			}
		}
System.out.println("The sum of even numbers is "+even);
System.out.println("The sum of odd numbers is"+odd);
	}

}
