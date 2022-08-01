package com.RestProject1.springrestapi.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.RestProject1.springrestapi.model.Benifits;
import com.RestProject1.springrestapi.model.Department;
import com.RestProject1.springrestapi.model.Employee;


public class EmployeeDTO {
	

	private Long id;
	

	private String name;

	private Long age;

	private String email;
	

	private  Long department; 
	

	private Long benifits;
	

	private Long manager;
	
	private String location;


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getDepartment() {
		return department;
	}


	public void setDepartment(Long department) {
		this.department = department;
	}


	public Long getBenifits() {
		return benifits;
	}


	public void setBenifits(Long benifits) {
		this.benifits = benifits;
	}


	public Long getManager() {
		return manager;
	}


	public void setManager(Long manager) {
		this.manager = manager;
	}





	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", department="
				+ department + ", benifits=" + benifits + ", manager=" + manager + ", location=" + location + "]";
	}


	public EmployeeDTO(Long id, String name, Long age, String email, Long department, Long benifits, Long manager,
			String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.department = department;
		this.benifits = benifits;
		this.manager = manager;
		this.location = location;
	}


	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
}