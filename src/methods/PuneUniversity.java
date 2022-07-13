package methods;

public class PuneUniversity {

	public static void main(String[] args) 
	{
	
		PuneUniversity pu = new PuneUniversity(); //created object of the class
		pu.StudentInfo(); // calling method without parameter 
		
		pu.StudentsInfo("Sawita", "PU34678", "Bcom", 3, 'A');
	}
 
    public void StudentInfo() // non-static method-->without parameters
    {
    	
    	// Name; PRN; Course; Year; Grade
    	
    	String name= "Velocity";
    	String PRN= "PU9096";
    	String course= "Engg";
    	int year=3;
    	char grade='A';
    	
    	System.out.println("=========================");
    	System.out.println("Students name is "+name);
    	System.out.println("Students PRN number is "+PRN);
    	System.out.println("Students course is "+course);
    	System.out.println("Students year is "+year);
    	System.out.println("Students grade is "+grade);
    	System.out.println("===========================");
    	
    	
    }
    
    public void StudentsInfo(String name,String PRN,String course,int year,char grade) //method with parameter
    {
    	System.out.println("==============================");
    	System.out.println("Students name is "+name);
    	System.out.println("Students PRN number is "+PRN);
    	System.out.println("Students course is "+course);
    	System.out.println("Students year is "+year);
    	System.out.println("Students grade is "+grade);
    	System.out.println("==============================");
    }
    }
