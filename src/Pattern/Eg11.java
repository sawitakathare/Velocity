package Pattern;

public class Eg11 {

	public static void main(String[] args) {
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		//row=9 col=5 star=5 space=0
		int star=5;
		int space=0;
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
			System.out.println();
		}
	}

}
