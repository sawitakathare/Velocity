package InterFaceStudy;

public class Child implements Mother {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.kindness();
		c.love();
		c.money();
		c.property();
		c.Laptop();
		
		System.out.println(a+b);
	}
	@Override
	public void kindness() {
		System.out.println("Mothers kindness");
		
		
	}

	@Override
	public void love() {
		System.out.println("Mothers love");
		
		
	}

	@Override
	public void money() {
		System.out.println("Fathers money");
		
		
	}

	@Override
	public void property() {
		System.out.println("Fathers property");
		
		
	}
	public void Laptop()
	{
		System.out.println("childs Laptop");
	}
	

}
