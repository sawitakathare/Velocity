package SuperKeyword;

public class B extends A {
	int a=300; //global variable from class B
	int b=400;
	public static void main(String[] args) {
		B b= new B();
		b.display();
		

	}
public void display()
{
	
	
	System.out.println("Local variable of a is "+a); //calling local value
	System.out.println("Global variable from same class is "+this.a); // calling global value of same class
	System.out.println("Global value of a from super class is "+super.a); // calling global variable of super class
	
	System.out.println("Local variable of b is "+b);//calling local value
	System.out.println("Globle variable from same class is "+this.b);// calling global value of same class
	System.out.println("Gloabl variable of b from super class is "+super.b);// calling global variable of super class
}
}
