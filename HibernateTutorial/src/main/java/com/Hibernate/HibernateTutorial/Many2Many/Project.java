package com.Hibernate.HibernateTutorial.Many2Many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int p_id;
	
	@Column(name = "Project_Name")
	private String project_name;
	
	@ManyToMany(mappedBy = "projects")      //a project can be assigned to many employees
	private List<Employee> emp;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int p_id, String project_name, List<Employee> emp) {
		super();
		this.p_id = p_id;
		this.project_name = project_name;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [p_id=" + p_id + ", project_name=" + project_name + ", emp=" + emp + "]";
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

}
