package ThisKeyword;

public class ThisUse {
	//this keyword is used to access global variable from same/current class
int a=80; //global variable
int b=100; // global variable
static int y=20; //static global variable
	public static void main(String[] args) {
		ThisUse tu= new ThisUse();
		tu.display();
		
		

	}
public void display()
{
	int a=50;
	int b=30;
	int y=45;
	
	System.out.println(a); //calling local variable
	System.out.println(this.a); //calling global variable using this keyword
	System.out.println(b);// calling local variable
	System.out.println(this.b); //calling global variable using this keyword
	System.out.println(y); //calling local variable
	int sum= this.y+y;
	System.out.println(sum);// calling global variable using this keyword
	System.out.println(this.y);
	
}
}
