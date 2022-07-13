package GlobalLocalVariable;

public class Global_Study {
	int a=100; //global non-static variable
	static int b=10; //global static variable

	public static void main(String[] args) {
		Global_Study GS=new Global_Study();
		
		System.out.println("Hi I am global non-static variable is "+GS.a); // printing statement of global non-static variable syntex
		
		System.out.println("Hi I am global static variable "+b); //printing statement of global static variable statement
		
		int addition= GS.a+b; //non static and static variable addition syntax
		System.out.println("addition is "+addition);
	}

}
