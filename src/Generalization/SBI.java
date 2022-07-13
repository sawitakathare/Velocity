package Generalization;

public class SBI implements RBI{

	@Override
	public void loan() {
		System.out.println("loan percentage 4%");
	}

	@Override
	public void withdrawal() {
		
		System.out.println("withdrawal capacity 10,000");
	}

	@Override
	public void deposit() {
		System.out.println("deposite capacity 10,000");
		
		
	}

}
