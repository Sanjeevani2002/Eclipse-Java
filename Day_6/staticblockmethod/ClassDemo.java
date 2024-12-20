package com.tnsif.Day_6.staticblockmethod;

public class ClassDemo {
public static void main(String[] args) {
		
		Class o1 = new Class();
		System.out.println(o1);
		
		Class.display(); // static method
		
		Class o2 = new Class();
		System.out.println(o2);
		Class.display();

	}

}
