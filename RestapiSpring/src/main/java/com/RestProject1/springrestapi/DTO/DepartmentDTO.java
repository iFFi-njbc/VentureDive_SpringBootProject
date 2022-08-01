package com.RestProject1.springrestapi.DTO;

public class DepartmentDTO {
	
	private Long id;
	private String name;
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
	@Override
	public String toString() {
		return "DepartmentDTO [id=" + id + ", name=" + name + "]";
	}
	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public DepartmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
