package com.tnsif.Day_8.functionalInterface;

public class functionalInterface {

	public static void main(String[] args) {
		
		// traditional way
//		GreetClass obj = new GreetClass();
//		obj.greetings();
//		
		// Lambda Expression
		
		Greet g1 =() -> {System.out.println("Hello All");
		System.out.println("Lambda Expression");
		};
		
		g1.greetings();

	}

}
