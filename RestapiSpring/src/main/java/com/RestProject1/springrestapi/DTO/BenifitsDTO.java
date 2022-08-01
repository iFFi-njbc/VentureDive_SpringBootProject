package com.RestProject1.springrestapi.DTO;

public class BenifitsDTO {
	
	private Long id;
	private String retirementPlan;
	private String laptop;
	private String healthcare;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRetirementPlan() {
		return retirementPlan;
	}
	public void setRetirementPlan(String retirementPlan) {
		this.retirementPlan = retirementPlan;
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
	public void setHealthcare(String healthcare) {
		this.healthcare = healthcare;
	}
	@Override
	public String toString() {
		return "BenifitsDTO [id=" + id + ", retirementPlan=" + retirementPlan + ", laptop=" + laptop + ", healthcare="
				+ healthcare + "]";
	}
	public BenifitsDTO(Long id, String retirementPlan, String laptop, String healthcare) {
		super();
		this.id = id;
		this.retirementPlan = retirementPlan;
		this.laptop = laptop;
		this.healthcare = healthcare;
	}
	public BenifitsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
