package com.tnsif.Day_9.String;

public class StringOperationsDemo {

	public static void main(String[] args) {
		
		String s1 =new String("Indian");
		
		
		String s3= s1.trim();
		System.out.println("trimed "+s3.length());
		
		System.out.println(s1);
		System.out.println("Length of String :"+s1.length());
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.substring(2,5));
		System.out.println(s1.substring(2));
		System.out.println();
		System.out.println(s1.isEmpty());
		
		// String Comparison
		s1="Good Morning";
		String s2=new String(s1);
		s3= "good morning";
				
		System.out.println(s1+ " < equals > "+s3 + " -> "+ s1.equals(s3));
		System.out.println(s1+ " < equals > "+s3 + " -> "+ s1.equalsIgnoreCase(s3));
		System.out.println(s2);

	}

}
