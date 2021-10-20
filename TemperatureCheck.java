
public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a Java program and name it Temperature Check. 
		//Create variable to store temperature.
		//Your program should check if temperature
		//is below 32 then it should print “Water
		//will freeze with temperature __“, otherwise “Water
		//will NOT freeze with temperature __“.
		System.out.println("Code starts..............");
		
		int temp= 30;
		if (temp<32) {
			System.out.println("Water will freez with temperature" +temp);
		}else {
			System.out.println("Watr will not freez with temperature" +temp);
			System.out.println(" Because the temperature is warm outside");
		}
	}

}
