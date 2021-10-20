package com.SyntaxClass5;
import java.util.Scanner;
public class Task004 {

	public static void main(String[] args) {
	System.out.println("Enter the name of the month you were born");
    Scanner input=new Scanner(System.in);
    String Month=input.nextLine();
    String season=null;
    
     if(Month.equals("March") || Month.equals("April") || Month.equals("May")) {
    	 season="Spring";
    	 System.out.println("You were born in Spring season");
     }else if(Month.equals("June") || Month.equals("July") || Month.equals("August")) {
    	 season="Summer";
    	 System.out.println("The were born in Summer season");
     }else if(Month.equals("September") || Month.equals("October") || Month.equals("November")) {
    	 season="Fall";
    	 System.out.println("You were born in Fall season");
     }else {
    	 season="Winter";
    	 System.out.println("you were born in Winter season");
     }

	}

}
