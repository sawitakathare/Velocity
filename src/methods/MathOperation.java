package methods;

public class MathOperation {

	public static void main(String[] args) 
	{
	
		// calling methods from same class
		// className objectName= new className();
		MathOperation mo= new MathOperation(); // created object of same class
		
		// objectName.methodName
		mo.addition(); // calling non-static method from same class
		sub(); // calling static method from same class
		
		
		
		// calling methods from another class
		// className objectName= new className();
		Test1 t1=new Test1(); // created object of another class
		t1.mul(); // calling non-static method from another class
		Test1.div(); // calling static method from another class
		
		

	}
	
	public void addition() // non-static regular method
	
	{
		int a=90;
		int b=10;
		int sum=a+b;
		System.out.println("Sum is "+sum);
		
		
	}
	
	public static void sub() // static regular method
	{
		
		int x=70;
		int y=90;
		int subs=x-y;
		System.out.println("Sub is "+subs);
	}

}
