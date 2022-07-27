package com.SpringFramework.spring1.xmlautowired;

public class Employee {
	
	private String Name;
	private Address address;
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", address=" + address + "]";
	}
	public Employee(String name, Address address) {
		super();
		Name = name;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
