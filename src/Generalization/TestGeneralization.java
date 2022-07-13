package Generalization;

public class TestGeneralization {

	public static void main(String[] args) {
		Jio j=new Jio();
		System.out.println("============JIO==========");
		j.call();
		j.data();
		j.msg();
		
		Airtel a=new Airtel();
		System.out.println("==========AIRTEL==========");
		a.call();
		a.data();
		a.msg();
		
		vi v=new vi();
		System.out.println("============VI============");
		v.call();
		v.data();
		v.msg();
	}

}
