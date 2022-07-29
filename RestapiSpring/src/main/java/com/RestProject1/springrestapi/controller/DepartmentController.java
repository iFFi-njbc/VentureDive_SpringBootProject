package com.RestProject1.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RestProject1.springrestapi.model.Benifits;
import com.RestProject1.springrestapi.model.Department;
import com.RestProject1.springrestapi.model.Employee;
import com.RestProject1.springrestapi.service.BasicBenefitsService;
import com.RestProject1.springrestapi.service.DepartmentService;
import com.RestProject1.springrestapi.service.EmployeeService;


@RestController
public class DepartmentController {
	
	@Autowired
	private EmployeeService empService; //as our application starts employeeservice will be injected to our Spring container

	@Autowired
	private DepartmentService dService;
	

	
	@GetMapping("/departments")  //--->@RequestMapping(--)
	public List<Department> getDepartments()
	{
		return dService.getDepartments();
	}
	
	@GetMapping("/departments/{id}") //PathVariable
	public Department getDepartment(@PathVariable("id") Long id)
	{
		return dService.getDepartment(id);
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable Long id, @RequestBody Department d)
	{
		System.out.println("Updating the Department for ID : " + id);
		d.setId(id);
		return dService.updateDepartment(d);
	}
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department d)
	{

		return dService.saveDepartment(d);
	}
	
	//localhost:8080/employees?id=24
	@DeleteMapping("/departments") //dealing with requestParams
	public void deleteEmployee(@RequestParam("id") Long id) //if the requestparam parameter name is same is Long variable then we do not have to specify paramter in requestparam
	{
		dService.deleteDepartment(id);
	}

}
