package com.Hibernate.HibernateTutorial.Many2Many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	private int e_id;
	
	@Column(name = "Employee_Name")
	private String name;
	
	@ManyToMany  //one employee can have many projects
	
	//changes name of added table and its column names
	
	@JoinTable(name="emp_learn", joinColumns={@JoinColumn(name="eid")}, inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Project> projects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int e_id, String name, List<Project> projects) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", projects=" + projects + "]";
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
