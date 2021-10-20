package com.syntax.reviewclass1;

public class Main2 {

	public static void  main(String[] args) {
		
		
		 // four types of boxes to store the whole numbers
		//**byte 
		//**short
		//**int
		//**long
		//byte shortestNumber=127;
		// byte shortestNumber=127;       // it shows wrong because it is duplicate
		System.out.println(shortestNumber); // the computer is confused which variable to execute
		
		byte shortestNumber=127;
		 shortestNumber=125;
		System.out.println(shortestNumber);  // we reassigned the variable 
		
		// short
		
		short nextBigNumber=12355;  // if we make the number bigger it indicates that it is wrong
		int famousDataTypeForWholeNumber=13456789;
		
		//long
		long veryBigDataType=123456678899999l;  // if the number is in the range of int even if we don't put (L) at the end it will
		//not show it wrong but if make the number bigger it will show wrong then we have to put L at he end.
		
		float decimalNumber=12345.5f;
		double biggerDecimalNumber=45678945.12;
		System.out.println(biggerDecimalNumber);
		
		int num1= 200;
			    int num2= 100;
			    System.out.println(num1+num2);
		
		
		
		// best practice these days use int for whole numbers
		// use double for decimal numbers
		
		char gender='f';  // if we put double quote it will show it wrong
		char specialcharacter='#';
		char specialcharacter2='@';
		char specialcharacter3='&';
		char specialcharacter4='*';
		String specialCharacter5="#"; // we can also use String insted of char the onle difference it takes more memory on computer
		
		
		
		
		
		
		 
	}
}
