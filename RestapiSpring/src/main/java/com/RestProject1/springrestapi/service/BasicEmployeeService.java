package com.RestProject1.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.RestProject1.springrestapi.model.Employee;
import com.RestProject1.springrestapi.repository.BenifitsRepository;
import com.RestProject1.springrestapi.repository.EmployeeRepository;



@Service
public class BasicEmployeeService implements EmployeeService{
	
	 @Autowired
	private EmployeeRepository empRepository; 
	


	
	@Override
	public List<Employee> getEmployees() {
		return empRepository.findAll();
	}



	@Override
	public Employee saveEmployee(Employee e) {
		
		return empRepository.save(e);
	}



	@Override
	public Employee getEmployee(Long id) {
		
		Optional<Employee> emp =  empRepository.findById(id);
		if(emp.isPresent())
		{
			return emp.get();
		}
		else
			throw new RuntimeException("Employee is not found for the ID : " + id);
	}



	@Override
	public void deleteEmployee(Long id) {
		empRepository.deleteById(id);
		
	}



	@Override
	public Employee updateEmployee(Employee emp) {
		
		return empRepository.save(emp);
	}

}
