package com.tnsif.Day_5.Inheritance;

public class Citizen {
	private String name;
	private String aadharno;
	private String address;
	private String phno;

	public Citizen()
	{
		System.out.println("Citizen object created");
	}
	
	public Citizen(String name, String aadharno, String address, String phno)
	{
		this.name= name;
		this.aadharno= aadharno;
		this.address= address;
		this.phno= phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharno;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharno = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
	
}



