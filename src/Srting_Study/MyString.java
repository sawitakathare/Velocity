package Srting_Study;

public class MyString {

	public static void main(String[] args) {
		String name="velocity"; // without using new keyword stored in constant pool area
		String s1= new String("name"); //using new keyword stored in non constant pool area
        System.out.println("============");
        
		System.out.println(name);
		System.out.println(s1);
		System.out.println("========================");
		
		System.out.println(name.length());//only showing output
		System.out.println(s1.length());
		System.out.println("====================");
		
		//1.string length method
		int a = name.length(); //to store the output in reference variable a
		System.out.println(a);
		int b = s1.length(); //to store the output in reference variable b
		System.out.println(b);
		System.out.println("====================");
		
		//2.ToUpperCase method
		System.out.println(name.toUpperCase());
		String c = name.toUpperCase();
		System.out.println(c); // to store the output in reference variable c
		
		System.out.println(s1.toUpperCase());// only showing output
		String e = s1.toUpperCase(); //to store the output of e in reference variable
		System.out.println(e);
		System.out.println("========================");
		
		//3.toLowercase method
		System.out.println(c.toLowerCase()); //only showing output
		String d = name.toLowerCase();//to store the output in reference variable d
		System.out.println(d); 
		
		
		System.out.println(e.toLowerCase()); //only showing output
		String f = s1.toLowerCase();//to store the output in reference variable d
		System.out.println(f);
		
		System.out.println("==============================");
		
		
		//4.equals() method study
		String a1="Velocity";
		String a2="Velocity";
		String a3= new String ("Velocity");
		String a4= new String ("velocity");
		
		// ==will compare memory location that will not compare string content
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1==a4);
		System.out.println(a3==a4);
		System.out.println("=================");
		
		//=will compare string content
		//System.out.println(a3=a4);
		//System.out.println(a1=a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		System.out.println(a3.equals(a2));
		System.out.println(a4.equals(a2));
		System.out.println("================");
		
		
		//contains() method use
		
		String m="SawitaKathare";
		System.out.println(m.contains("re"));
	 boolean result = m.contains("re");
	 System.out.println(result);
	 
	 System.out.println(m.contains("k"));
	boolean m1 = m.contains("k");
	System.out.println(m1);
	System.out.println("=============="); 
	
	
	//isEmpty() method use
	
	String x="Mumbai";
	String y="";
	String z=" ";
	//String n=null;
	
	
	System.out.println(x.isEmpty());
	boolean x1 = x.isEmpty();
	System.out.println(x1);
	
	System.out.println(y.isEmpty());
	boolean y1 = y.isEmpty();
	System.out.println(y1);
	
	System.out.println(z.isEmpty());
	System.out.println("=============");
	
	//System.out.println(n.isEmpty());
	
	
	//isBlank() string method
	
	String c1=" ";
	String c2="";
	String c3="w";
	
	System.out.println(c1.isBlank());
	System.out.println(c2.isBlank());
	System.out.println(c3.isBlank());
	System.out.println("====================");
	
	//charAt() string method
	String i="Duniya";
	System.out.println(i.charAt(3));
	//System.out.println(i.charAt(6));
	System.out.println(i.charAt(0));
	//System.out.println(i.charAt(-1));
	System.out.println("===================");
	
	
	//endsWith() string method
	String d1="Velocity";
	
	System.out.println(d1.endsWith(y));
	System.out.println(d1.endsWith("ity"));
	System.out.println(d1.endsWith("lot"));
		
	//startWith() string method
	String f1="Maharashtra";
	System.out.println(f1.startsWith("Maha"));
	 boolean State = f1.startsWith("Maha");
	 System.out.println(State);
	 System.out.println("=================");
	 
	 //subString() string method
	 String g1="Lonavala";
	 System.out.println(g1.substring(4));
	 System.out.println(g1.substring(3));
	 System.out.println(g1.substring(2));
	 System.out.println(g1.substring(1));
	 System.out.println(g1.substring(0));
	 System.out.println("=================");
		
	//Concat() string method
	 String t1= "Java Classes";
	 System.out.println(t1.concat(" testing"));
	 String t2=" automation";
	 String t3=t1.concat(t2);
	 System.out.println(t3);
	 System.out.println(t1.concat(t2));
	 System.out.println("==========================");
	 
	 
	 //indexOf() string method
	 String v1= "Software Testing";
	 System.out.println(v1.indexOf("o"));
	 System.out.println(v1.indexOf("w"));
	 System.out.println("=======================");
	 
	 //lastindexOf() string method 
	 String s= "software testing";
	 System.out.println(s.lastIndexOf("t"));
	 System.out.println(s.lastIndexOf("g"));
	 System.out.println("==========================");
	 
	 //replace() string method
	 String s2="Automation Testing Java Class";
	 System.out.println(s2.replace("t", "x"));
	 System.out.println(s2.replace("a","i"));
	 System.out.println("========================");
	 
	
	 
		
	}

}
