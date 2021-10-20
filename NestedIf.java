
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine=true;
		boolean secondDose=true;
		if(vaccine) {  //yes
		System.out.println("lets check how many doses you got");
		
		if(secondDose) {
			System.out.println("you are fully vaccinated");
			
		}else {
			System.out.println("you will need to get a second dose");
			
		}
		System.out.println("End of if block");
		}
		System.out.println("End of the code");
	}

}
