package com.syntaxclass09;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList is more convenient and easy to add, remove, contain and so on which we can not do it in array.
		
		String []fruits =  new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Straberry";
		System.out.println(fruits[1]);
		
		ArrayList fruitList =  new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Straberry");
		fruitList.remove("Mango");
		System.out.println(fruitList.contains("Orange"));
		System.out.println(fruitList);

	}

}
