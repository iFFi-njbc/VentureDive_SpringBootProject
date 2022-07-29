package com.RestProject1.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return drepo.save(d);
	}

	@Override
	public Department getDepartment(Long id) {
		
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
		drepo.deleteById(id);

	}

	@Override
	public Department updateDepartment(Department d) {
		return drepo.save(d);
	}

}
