package com.RestProject1.springrestapi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "benifits")
public class Benifits {
	
	@Id
	@GeneratedValue()
	@Column(name = "id")
	private Long id;
	
	@Column(name = "remote")
	private String remote;
	@Column(name = "laptop")
	private String laptop;
	@Column(name = "healthcare")
	private String healthcare;
	

	public Benifits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Benifits(Long id, String remote, String laptop, String heathcare) {
		super();
		this.id = id;
		this.remote = remote;
		this.laptop = laptop;
		this.healthcare = heathcare;
		//this.employee = employee;
	}


	@Override
	public String toString() {
		return "Benifits [id=" + id + ", remote=" + remote + ", laptop=" + laptop + ", healthcare=" + healthcare + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRemote() {
		return remote;
	}
	public void setRemote(String remote) {
		this.remote = remote;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	public String getHealthcare() {
		return healthcare;
	}
	public void setHeathcare(String heathcare) {
		this.healthcare = heathcare;
	}

}
