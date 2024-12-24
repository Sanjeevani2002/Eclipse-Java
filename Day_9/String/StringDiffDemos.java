package com.tnsif.Day_9.String;

public class StringDiffDemos {
	
	public static void main(String[] args) {
	String str = "hello Sanjivani"; //literal Method /primitive type
	String s1 = new String("Sanju"); //object type
	char C[] = {'a','b','g','f'} ; 
	String s2 = new String(C); 
	String s3 = new String(s1);
	
	System.out.println("Object type = i am "+ s1);
	System.out.println("Char into string = "+ s2);
	System.out.println("obj in obj = i am "+ s3);
	System.out.println("normal string = "+str);
	
	//using Concatenation to prevent Long lines
	//1
	String Longstr = "this program is to learn"+"the string class in java "+"and concatenate one or more strings";
	System.out.println(Longstr);
	//2
	String s4 = str+" let's learn java "+ s1;
	System.out.println(s4);
	
	
	
	}
}
