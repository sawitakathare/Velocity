package Pattern;

public class Eg9 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//      ****
//      ***
//      **
//      *
		//row=9
				int star=1;
		        int space=0;
		        for(int i=1; i<=9; i++)
		        {
		        	for(int j=1; j<=star; j++)
		        	{
		        		System.out.print("*");
		        	}
		        	if(i<5)
		        	{
		        		star++;
		        	}
		        	else
		        	{
		        		star--;
		        	}
		        	System.out.println();
		        }
	}

}
