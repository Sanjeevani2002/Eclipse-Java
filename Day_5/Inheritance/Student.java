package com.tnsif.Day_5.Inheritance;

public class Student extends Citizen{
	private int rollNo;
	private String collegeName;
	
	public Student()
	{
		super();
	}
	
	public Student(String name, String aadharno, String address, String phno, int rollNo, String collegeName)
	{
		super(name, aadharno, address, phno);
		this.rollNo= rollNo;
		this.collegeName= collegeName;
	}
	
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

	public static void main(String[] args) {
		
	}
	
}



