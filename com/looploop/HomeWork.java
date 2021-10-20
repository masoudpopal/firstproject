package com.looploop;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// we can use nested loop to iterate through each day of a week for 3 weeks.
		//int weeks=3;
		//int days =7;
		
		//for (int i=1; i<=weeks; ++i) {
			//System.out.println(" week: " +  i);
			//for(int j=1; j<=days; ++j) {
				//System.out.print(" days: " + j);
			//}
         // }
		// use the same example using a for loop inside the while loop
		//int week=3;
		//int  day=7;
		//int i=1;
		
		//while (i<=weeks) {
			//System.out.println(" week: " +i);
			
			//for (int j= 1; j<=days; ++j) {
				//System.out.println(" days: " +j);
			
				
			//}
			
		//}
		
		System.out.println("----------- end of the code-----------------");
		
		// if we use continue statement inside a inner loop it will escape the inner loop but it won't touch the outer loop
		int week=3;
		int day=7;
		
		for(int i=1; i<=week; ++i) {
			System.out.println(" week: " +i);
			for(int j=1; j<=day; ++j) {
				if(j%2!=0) {        // here we said if the value of j is odd continue
					continue;
				}
				System.out.println("day: " +j);
			}
		}
		
	}

}
