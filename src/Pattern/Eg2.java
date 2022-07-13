package Pattern;

public class Eg2 {

	public static void main(String[] args) {
		 //*
	   	 //**
	   	 //***
	   	 //****
	   	 //*****
	   	 //row=5 col=5 star=1
	       int Star=1;
	       for(int i=1; i<=5; i++)
	       {
	    	   for(int j=1; j<=Star; j++)
	    	   {
	    		   System.out.print("*");
	    	   }
	    	   System.out.println();
		       Star++;
	       }
	       
	       System.out.println("====================");
	     //*****
	     //****
	     //***
	     //**
	     //*
	       //row=5 col=5 star=5
	       int star=5;
	       for(int i=1; i<=5; i++)
	       {
	    	   for(int j=1; j<=star; j++)
	    	   {
	    		   System.out.print("*");
	    	   }
	    	   System.out.println();
	    	   star--;
	       }
	       System.out.println("==================");

	}

}
