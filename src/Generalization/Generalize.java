package Generalization;

public class Generalize {

	public static void main(String[] args) {
		HDFC hdfc= new HDFC();
		hdfc.deposit();
		hdfc.loan();
		hdfc.withdrawal();
		
		SBI sbi= new SBI();
		sbi.deposit();
		sbi.loan();
		sbi.withdrawal();
	}

}
