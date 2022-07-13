package Constructor;

public class DefaultConstuctor {

	public static void main(String[] args) 
	{
		 DefaultConstuctor DC=  new DefaultConstuctor();
		 DC.add(40, 30);
		 
		 DefaultConstuctor DC1= new DefaultConstuctor();
		 DC1.sub(80, 50);
	}
public void add(int a, int b)
{
	System.out.println(a+b);
}

public void sub (int p, int q) 
{
	System.out.println(p-q);
}
}
