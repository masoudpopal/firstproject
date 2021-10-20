package com.LogicallOperators006;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char gender='F';
      switch (gender) {
      case 'M':
    	  System.out.println(" Male ");
    	  break;
      case 'F':
    	  System.out.println(" Female ");
    	  break;
    	  default:
    		  System.out.println("Gender is Unknow");
    		  /*
    		   * I want to ask where you are from?
    		   * based on the the country we will define traditional?
    		   *
    		   */
    		  
    		  Scanner in;
    		  String country = null;
    		  String TraditionalFood;
    		  
    		  in=new Scanner(System.in);
    		  System.out.println("Hey, where are you from?");
    		  
    		  
    		  switch (country) {
    		  
    		  case "USA":
    			  TraditionalFood="burger";
    			  break;
    		  case "Afghanistan":
    			  TraditionalFood="qabeli Palaw";
    			  break;
    		  case "Peru":
    			  TraditionalFood="cevice";
    			  break;
    		  }
	}

}
}
