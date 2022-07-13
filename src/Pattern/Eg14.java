package Pattern;

public class Eg14 {

	public static void main(String[] args) {
//		***** *****
//		****   ****
//		***     ***
//		**       **
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
		//row=9 col=10 
				int star1=5;
				int space1=0; 
				int star2=5;
				int space2=0;
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
					for(int j=1; j<=star2; j++)
					{
						System.out.print("*");
					}
					if(i<5)
					{
						star1--;
						space1++;
						star2--;
						space2++;
					}
					else {
						star1++;
						space1--;
						star2++;
						space2--;
					}
					System.out.println();
					
				}
				
			

		
	}

}
