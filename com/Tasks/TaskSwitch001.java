package com.Tasks;
import java.util.Scanner;
public class TaskSwitch001 {
	public static void main(String[] args){
		  
		   
		   int age=7;
		   Scanner input=new Scanner(System.in);
		   System.out.println("Enter the age of the child");
		    age=input.nextInt();
		   String description=null;

		   switch (age ) {
		     case '1':
		     description= "You can Crawl";
		     break;
		     case '2':
		     description= "You can Talk";
		     break;
		     case '3':
		     description= "You can Dance";
		     break;
		     case '4':
		     description= "You can get Trouble";
		     break;
		   

		   }

		System.out.println(age+description);
}
}