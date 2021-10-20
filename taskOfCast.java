
public class taskOfCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=20;
		int num2=30;
		
		if (num1>num2) {
			System.out.println(num1+ " is larger than" +num2);
		} else if(num1<num2) {
			System.out.println(num2+" is larger than" +num1);
			
		} else {
			System.out.println(num1 +" is equal to " +num2);
		}
		
		
		System.out.println("-----------------------------------------------------------------------");
		//
		//declare a variable day and then based on the day value provide out put such as 
		// if day is equal to 1--> Today is Monday
		// if day is equal to 2--> today is Tuesday 
		
		int day =6;
		
		if (day==1) {
			System.out.println("Today is Monday");
		} else if (day==2) {
			System.out.println("Today is Tuesday");
		} else if (day==3)  {
			System.out.println("Today is Wednesday");
		}
		
		System.out.println("end of my code.....");
	}

}
