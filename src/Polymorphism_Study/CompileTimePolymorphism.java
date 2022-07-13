package Polymorphism_Study;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		test();
		test(234, 768);
		
	}
public static void test()
{
	System.out.println("good evening");
}
public static void test(int a, int b)
{
	System.out.println(a-b);
}
}
