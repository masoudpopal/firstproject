package com.ForLoop;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String item=null;
		int money =0;
		int price=0;
		int change=0;
		
		System.out.println("enter the item you want to buy");
		item=input.nextLine();
		System.out.println("pay the money");
		money=input.nextInt();
		price=input.nextInt();
		change=input.nextInt();
		
		
			if (money!=(price)) {
				
				System.out.println("pay more");
				
				
			}else if(money>price) {
				System.out.println("pay the change");
			}else {
				System.out.println("Thank you for your payment");
			}
		}

	}


