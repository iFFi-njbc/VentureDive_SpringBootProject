package com.RestProject1.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestProject1.springrestapi.exception.BenifitsException;
import com.RestProject1.springrestapi.exception.DepartmentException;
import com.RestProject1.springrestapi.model.Benifits;
import com.RestProject1.springrestapi.model.Department;
import com.RestProject1.springrestapi.model.Employee;
import com.RestProject1.springrestapi.repository.DepartmentRepository;

@Service
public class BasicDepartmentService implements DepartmentService {
	
	
	 @Autowired
	private DepartmentRepository drepo; 
	

	@Override
	public List<Department> getDepartments() {
		
		return drepo.findAll();

	}

	@Override
	public Department saveDepartment(Department d) {
		if(d.getId() == null)
		{
			throw new DepartmentException("800", "Enter Department ID");
		}
		if(d.getName().isEmpty()  || d.getName().length() == 0)
		{
			throw new DepartmentException("801", "Enter proper Department name");
		}
		
		return drepo.save(d);
	}

	@Override
	public Department getDepartment(Long id) {
		
		if(id == null || id == 0)
		{
			throw new DepartmentException("802", "Enter Departments ID");
		}
		
		Optional<Department> d =  drepo.findById(id);
		if(d.isPresent())
		{
			return d.get();
		}
		else
			throw new RuntimeException("Department is not found for the ID : " + id);
	}

	@Override
	public void deleteDepartment(Long id) {
		
		Optional<Department> d =  drepo.findById(id);
		if(d.isPresent())
		{
			drepo.deleteById(id);
		}
		else
			throw new DepartmentException("803", "Department are not found for the ID : " + id);
		
		//drepo.deleteById(id);

	}

	@Override
	public Department updateDepartment(Department d) {
		if(d.getId() == null)
		{
			throw new DepartmentException("800", "Enter Department ID");
		}
		if(d.getName().isEmpty()  || d.getName().length() == 0)
		{
			throw new DepartmentException("801", "Enter proper Department name");
		}
		return drepo.save(d);
	}

}
