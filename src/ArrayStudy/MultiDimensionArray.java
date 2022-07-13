package ArrayStudy;

public class MultiDimensionArray {

	public static void main(String[] args) {
		int marks[][]= {{30,20,45},{25,30,67}};
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(marks[i][j]+ " ");
			}
			System.out.println();
		}
		
		int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
	    a[1][1]=4;
	    System.out.println(a[0][0]);
	    //System.out.println("this is change for git hub");
	    
		}

	


}
