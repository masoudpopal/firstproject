package com.Tasks;
import java.util.Scanner;
public class TaskSwitch {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter your grade");
    
    char grade=input.next().charAt(0);
    String Explanition=null;
    
    switch (grade) {
    case 'A':
    	Explanition = "A which is Excellent";
    	break;
    case 'B':
    	Explanition = "B which is Good";
    	break;
    case 'C':
    	Explanition = "C which is Average";
    	break;
    case 'D':
    	Explanition = " D which is Bad ";
    	break;
    default:
    	Explanition = " Not accepted";
    	
    }
    System.out.println("Your grade is " +Explanition);
	}
}
	
