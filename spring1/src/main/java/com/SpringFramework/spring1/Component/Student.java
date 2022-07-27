package com.SpringFramework.spring1.Component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Ifrah")
	private String Name;
	@Autowired
	private Address address;
	
	@Value("#{friends}")
	private List<String> friends;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Address address) {
		super();
		Name = name;
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", address=" + address + ", friends=" + friends + "]";
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
