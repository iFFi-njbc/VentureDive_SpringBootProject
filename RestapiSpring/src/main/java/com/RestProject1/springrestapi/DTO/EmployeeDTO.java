package com.RestProject1.springrestapi.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.RestProject1.springrestapi.model.Benifits;
import com.RestProject1.springrestapi.model.Department;
import com.RestProject1.springrestapi.model.Manager;

public class EmployeeDTO {
	

	private Long id;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	private String name;

	private Long age;

	private String location;

	private String email;
	

	private Department department; 
	

	private Benifits benifits;
	

	private Manager manager;
	


	

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}



	public EmployeeDTO(Long id, String name, Long age, String location, String email, Department department,
			Benifits benifits, Manager manager) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
		this.email = email;
		this.department = department;
		this.benifits = benifits;
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", email=" + email
				+ ", department=" + department + ", benifits=" + benifits + ", manager=" + manager + "]";
	}
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Benifits getBenifits() {
		return benifits;
	}
	public void setBenifits(Benifits benifits) {
		this.benifits = benifits;
	}

	
}


