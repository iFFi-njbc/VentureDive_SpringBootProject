package com.RestProject1.springrestapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



//@Getter
//@Setter

@Entity   //by this this class now represents entity Table in our database application
@Table(name = "employee")
public class Employee {
	
	//@JsonProperty("fullname")
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "name")
	private String name;
	//@JsonIgnore
	
	@Column(name = "age")
	private Long age;
	@Column(name = "location")
	private String location;
	@Column(name = "email")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "benefits_id", referencedColumnName = "id")
	private Benifits benifits;
	

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Column(name = "department")
	private String department; 
	
	
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





	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Benifits getBenifits() {
		return benifits;
	}
	public void setBenifits(Benifits benifits) {
		this.benifits = benifits;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", email=" + email
				+ ", benifits=" + benifits + ", department=" + department + "]";
	}
	public Employee(Long id, String name, Long age, String location, String email, Benifits benifits,
			String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
		this.email = email;
		this.benifits = benifits;
		this.department = department;
	}



	


}
