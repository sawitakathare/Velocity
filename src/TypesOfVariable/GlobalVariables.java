package TypesOfVariable;

public class GlobalVariables {
	String name;
	int rollNo;
	char grade;
	float age;
	
	
	public void Student_Info()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student rollNo is "+rollNo);
		System.out.println("Student grade is "+grade);
		System.out.println("Student age is "+age);
	}
	
	

	public static void main(String[] args) 
	{
		GlobalVariables Sawita= new GlobalVariables();
		Sawita.name="Sawita Lokhande";
		Sawita.rollNo=5;
		Sawita.grade='A';
		Sawita.age=28;
		
		
		Sawita.Student_Info();
		
		
		
		
		
		

	}

}
