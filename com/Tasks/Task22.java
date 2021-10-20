import java.util.Scanner; 
class Main {
public static void main(String [] args){

String  Asghar,Moazzam,Weqas,Asel,description;

Scanner input=new Scanner(System.in);
System.out.println("Enter name of the instructor");
String name=input.nextLine();


switch(name){
  case "Asghar":
description="Will take care of Java Assignment";
break;
case"Moazzam":
description="Will take care of SCLC Assignment";
break;
case"Weqas":
description="Will take car of Selenium Assignment";
break;
case"Asel":
description="Will take care of every Assignment";
break;
default:
description="Invalid instructor selected";
break;
}

System.out.println(name + description);



}
}

