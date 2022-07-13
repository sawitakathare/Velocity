package Control_Statement;

public class Nested_If_Else {

	public static void main(String[] args) {
		String UN="sawita";
		String PWD="sawi123";
		
		if (UN=="sawita") {
			System.out.println("correct UN please enter password");
			
			if (PWD=="sawi123") {
				System.out.println("login successful");
				
			}
			else {
				System.out.println("wrong password please enter correct password");
			}
			
			}
			else {
				System.out.println("Incorrect username unable to login");
		}
		
		
	}

}
