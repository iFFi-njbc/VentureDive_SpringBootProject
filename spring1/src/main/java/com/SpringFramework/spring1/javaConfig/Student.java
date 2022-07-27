package com.SpringFramework.spring1.javaConfig;

public class Student {
	
	private String Name;
	private int rollno;
	private Address address;
	
	
	public Student(String name, int rollno, Address address) {
		super();
		Name = name;
		this.rollno = rollno;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollno) {
		super();
		Name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", rollno=" + rollno + ", address=" + address + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}
