package com.syntax.class03;

public class whathappens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int i=1.99; error
		int i=(int)1.99;
		System.out.println(i);
		double d=1; 
		System.out.println(d); //1.0
		// casting in JAVA
		// Widening/ implicit / automatic = byte short =int =long= float= double
		// narrowing/ explicit/manual= double= float = long= int= short = byte 
		
		byte b=(byte)128;         // byte b=128;    changed from big to small       // byte b=(byte)128;
		System.out.println(b);
		
		int num=20;
		int num1=3;
		System.out.println(num/num1);       // int type do not show the decimal 
		
		double num2=20;
		double num3=3;
		System.out.println(num2/num3);       // double type will show the decimal 
		
		
		float f= 10.99f;     // if we don't add (f) at the end of the number java will complain 
		double number=10.99;
		
		int n1 = 20;
		int n2 = 3;
		double dd= n1 / n2;
		System.out.println(dd);
		
		
		// assignment opr = +,-,*,/,%
		
		// relational operators: >, >=, 
		
		
		
		
	}

}
