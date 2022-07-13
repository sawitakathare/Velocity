package Pattern;

public class Eg8 {

	public static void main(String[] args) {
//		*        *
//		**      **
//		***    ***
//		****  ****
//		***** *****
//		****  ****
//		***    ***
//		**      **
//		*        *
		//row=9
		int star1=1;
		int space1=5;
		int star2=1;
		int space2=5;
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=star1; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=space1; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=space2; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star2; j++ )
			{
				System.out.print("*");
			}
			if(i<5)
			{
				star1++;
				space1--;
				space2--;
				star2++;
			}
			else
			{
				star1--;
				space1++;
				space2++;
				star2--;
			}
			System.out.println();
			
			
				
		}
	}

}
