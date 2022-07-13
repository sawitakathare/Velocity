package Constructor;

public class UserDefineConstructor {
	int a,b,c;
	public UserDefineConstructor()
	
	{
		a=20;
		b=10;
		c=10;
	}

	public static void main(String[] args) {
		
UserDefineConstructor UDC= new UserDefineConstructor(); // without parameter
		UDC.mul();
		
UserDefineConstructor udc= new UserDefineConstructor();
        udc.addition(); // calling method with zero parameter
        
UserDefineConstructor udc1= new UserDefineConstructor(1000);
        udc1.addition(); 
        
UserDefineConstructor udc2= new UserDefineConstructor(80, 90);
        udc2.addition();
        
UserDefineConstructor udc3= new UserDefineConstructor(20, 30, 40);
        udc3.addition();
        

	}
public void mul()
{
	System.out.println(a*b*c);
	
}
public void addition()
{
	System.out.println(a+b+c);
}

public UserDefineConstructor(int x) //user define constructor with single parameter
{
	a=x;
	
}

public UserDefineConstructor (int x,int y) // user define constructor with two parameter
{
	a=x;
	b=y;
}
public UserDefineConstructor (int x,int y,int z) // user define constructor with three parameter
{
	a=x;
	b=y;
	c=z;
}

}
