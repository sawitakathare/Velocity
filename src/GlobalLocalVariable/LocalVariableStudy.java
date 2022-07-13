package GlobalLocalVariable;

public class LocalVariableStudy {
	int x=10; // global variable non static

	public static void main(String[] args)
	{
		
		LocalVariableStudy add= new LocalVariableStudy();
        
		add.addition();
		
		System.out.println("value of static global variable from another class is "+GlobalLocalDiffClass.p);
		
		GlobalLocalDiffClass GLD= new GlobalLocalDiffClass();
		System.out.println("value of non static global varible from another class is "+GLD.q);
		
		GLD.Local();
		
		
		
		
		
				
	
	}
public void addition()
{
	int a=50; //local non static variable
	
	System.out.println("value of a is "+a);
	
	int sum=x+a;
	System.out.println("sum is global ana local variable "+sum);
	
	
	
	
}
}
