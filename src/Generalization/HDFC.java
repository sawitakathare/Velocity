package Generalization;

public class HDFC implements RBI {

	@Override
	public void loan() {
		System.out.println("loan percentage 10%");
	}

	@Override
	public void withdrawal() {
		System.out.println("capacity of money withrawal is 50,000");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit capacity is 10,00,000");
		
		
	}
	

}
