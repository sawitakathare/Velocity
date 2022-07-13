package InterFaceStudy;

public class Implimenatation implements Interface_Study {

	public static void main(String[] args) {
		Implimenatation i= new Implimenatation();
		i.demo();
		i.demo(10, 20);
		System.out.println("value of a is "+a);
		
	}

	@Override
	public void demo() {

System.out.println("hi");
		
	}

		
	

	@Override
	public void demo(int a, int b) {
		System.out.println(a+b);
		
	}
	

}
