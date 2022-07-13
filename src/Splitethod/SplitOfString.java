package Splitethod;

public class SplitOfString {

	public static void main(String[] args) {
		String a="Velocity_Corporate_Training_Center";
		
		String[] output = a.split("_");
		
		//always Array printing statement should be in for loop
		for(int i=0;i<=output.length-1;i++)
		{
			System.out.println(output[i]);
		}
	}

}
