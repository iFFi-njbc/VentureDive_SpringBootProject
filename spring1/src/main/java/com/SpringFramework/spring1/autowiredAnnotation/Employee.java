package com.SpringFramework.spring1.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String Name;
	@Autowired
	@Qualifier("address2")
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
