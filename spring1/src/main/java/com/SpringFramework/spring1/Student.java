package com.SpringFramework.spring1;

public class Student {
	private int Id;
	private String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
	

}
