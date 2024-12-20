package com.tnsif.Day_5.MultiInheritance;
import java.util.Date;
public class Employee extends Person{

	private String deptName;
	private double baseSalary;
	
	public Employee(String name, long contactNo, Date dateOfBirth, String deptName, Double baseSalary)
	{
		super(name, contactNo, dateOfBirth);
		this.deptName= deptName;
		this.baseSalary=baseSalary;	
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String depName) {
		this.deptName = depName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [depName=" + deptName + ", baseSalary=" + baseSalary + ", getName()=" + getName()
				+ ", getContactNo()=" + getContactNo() + ", getDateOfBirth()=" + getDateOfBirth() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}

