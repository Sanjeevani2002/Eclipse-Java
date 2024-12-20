 package com.tnsif.Day_5.hierarchicleInheritance;

public class Student extends Person {
	
	private String clas;
	private float per;
	
	public Student() {
		System.out.println("Student class default constructor");
		clas = "Last Year";
		per = 80;
	}
	
	public Student(String clas, float per) {
		this.clas = clas;
		this.per = per;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}
 
	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public Student(String name, String city, String clas, float per) {
		super(name, city);
		this.clas = clas;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	// Main method to run the program
	public static void main(String[] args) {
		System.out.println("Testing Student class...");

		// Create a Student object
		Student student = new Student("John", "New York", "Final Year", 85.5f);

		// Print the Student object
		System.out.println(student);
	}
}
