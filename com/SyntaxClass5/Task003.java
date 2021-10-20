package com.SyntaxClass5;
import java.util.Scanner;
public class Task003 {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
    
    
    System.out.println("Please entr your your score");
    
    float Quiz=input.nextFloat();
    float Midterm=input.nextFloat();
    float Final=input.nextFloat();
    float Ave=(Quiz+Midterm+Final)/3;
    
    if(Ave>=90) {
    	System.out.println("The average score for this student is A");
    }else if(Ave>=70 && Ave<90) {
    	System.out.println("The average score for this student is B");
    }else if(Ave>=50 && Ave<70) {
    	System.out.println("The average score for this student is C");
    }else {
    	System.out.println("The average score for this student is F");
    }
    }
    
    
    

	}

