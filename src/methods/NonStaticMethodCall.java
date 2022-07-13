package methods;

public class NonStaticMethodCall {
	
	

	public static void main(String[] args) 
	{
		
		// Object creation should be done in main method
		// syntax for object creation
		// ClassName objectName= new ClassName();
		
		NonStaticMethodCall nsm= new NonStaticMethodCall(); //created object of a same class
         // after creating object--> call non static regular method
		// syntax to call non static regular method--> objectName.MethodName();
		
		nsm.MyMethod(); // calling non-Static regular method
		
		nsm.display(); // calling non-static regular method
		
		nsm.test(); // calling non-static regular method
		
		
		// How to call non static regular method from another class
		// We need to create object of that class
		
		//ClassName objectName= new ClassName();
		NonStaticSample nss= new NonStaticSample(); // created object from another class
		
		// ObjectName.MethodName();
		nss.test1();
		
		// ObjectName.MethodName();
		nss.testcase1();
		
		
		

	}

	
	public void MyMethod() // Non-Static Regular Method
	
	{
		System.out.println("Hi I am Non-Static Regular Method for same class");
		
		// To call Non-Static Regular Method we need an object of a class
		
		// How to call object--> see in main method
			
	}
	
	
	public void display() // Non-Static regular method
	
	{
		System.out.println("Hi I am Nn-Static Regular having method name display for same class");
		
		// To call non static regular method we need an object of a class
		
		// How to call object--> see in main method
	}
	
	public void test() // non static regular method
	
	{
		System.out.println("Hi this is non static regular method having method name test for same class");
		
		// To call non static regular method object of a class is required
		
		// How to call object-->see in main method
	}
	
}
