package com.Loop002;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=9;
		for (int i=1; i<=10; i++) {
			System.out.println(num+"x" +i+ "="+num*i);
		}
		System.out.println("what is the output?");
		int sum=0;
		for(int i=1; i<=3; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println("what is the output?");
		sum=0;
		for(int i=1; i<=40; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("What is the output?");
		int total=1;
		for(int i=1; i<=10; i++) {
			total*=i;
		}
		System.out.println(total);
	}
	

}
