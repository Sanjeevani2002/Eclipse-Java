package com.tnsif.Day_8.MarkerInterface;

public class Driver {

	public static void main(String[] args) {
		
		Student s5 = new Student();
		Teacher t1 = new Teacher();
		 
		
		if(t1 instanceof Registrable)
		{
			System.out.println("Student is registered");
		}
		else
		{
			System.out.println("Student is not Registered");
		}
		// TODO Auto-generated method stub

	}

}
