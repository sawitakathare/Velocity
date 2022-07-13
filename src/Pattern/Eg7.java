package Pattern;

public class Eg7 {

	public static void main(String[] args) {
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		//row=5 col=9 star=9 space=0
		int star=9;
		int space=0;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
		
		for(int j=1; j<=star; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		star=star-2;
		space++;
		}
	}

}
