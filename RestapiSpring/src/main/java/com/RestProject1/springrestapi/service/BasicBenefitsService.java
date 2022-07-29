package com.RestProject1.springrestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestProject1.springrestapi.model.Benifits;
import com.RestProject1.springrestapi.model.Employee;
import com.RestProject1.springrestapi.repository.BenifitsRepository;
import com.RestProject1.springrestapi.repository.EmployeeRepository;

@Service
public class BasicBenefitsService implements BenifitsService {
	
	
	 @Autowired
	private BenifitsRepository brepo; 
	 
	 @Autowired
	 private BasicEmployeeService eService;

	@Override
	public Benifits getbenifit(Long id) {
		
		Optional<Benifits> b = brepo.findById(id);
		if(b.isPresent())
		{
			return b.get();
		}
		else
			throw new RuntimeException("Benifits not found for the ID : " + id);
	}

	@Override
	public List<Benifits> getBenifits() {
		return brepo.findAll();
	}

	@Override
	public Benifits saveBenefit(Benifits b) {
		return brepo.save(b);
	}

	@Override
	public void deleteBenifit(Long id) {
		brepo.deleteById(id);
		
	}

	@Override
	public Benifits updateBenifit(Benifits b) {
		return brepo.save(b);
	}

	@Override
	public List<Employee> getEmployees(Long id) {
		List<Employee> emp = new ArrayList<Employee>();
		
		for(Employee e : eService.getEmployees())
		{
			if(e.getBenifits().getId().equals(id))
			{
				emp.add(e);
			}
		}
		
		return emp;
	}
	



}
