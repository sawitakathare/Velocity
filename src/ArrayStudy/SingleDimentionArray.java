package ArrayStudy;

public class SingleDimentionArray {

	public static void main(String[] args) {
		// A B C D
		char grade[]= new char[4];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println("===============");
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(grade[i]);
			System.out.println("=============");
		}
		int RollNo[]= new int[6];
		RollNo[0]=10;
		RollNo[1]=30;
		RollNo[2]=60;
		RollNo[3]=20;
		RollNo[4]=90;
		System.out.println(RollNo[4]);
		System.out.println(RollNo[3]);
		System.out.println(RollNo[2]);
		System.out.println(RollNo[1]);
		System.out.println(RollNo[0]);
		System.out.println("=======================");
		
		
		int rollNo[]= {1,2,3,4,5};
		System.out.println(rollNo[2]);
		System.out.println("=====================");
		
	}

}
