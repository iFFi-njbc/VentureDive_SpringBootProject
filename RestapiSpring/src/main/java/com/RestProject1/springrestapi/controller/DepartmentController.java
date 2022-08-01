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

import com.RestProject1.springrestapi.Converter.DepartmentConvertor;
import com.RestProject1.springrestapi.DTO.DepartmentDTO;
import com.RestProject1.springrestapi.DTO.EmployeeDTO;
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
	
	@Autowired
	private DepartmentConvertor convert;
	

	
	@GetMapping("/departments")  //--->@RequestMapping(--)
	public List<DepartmentDTO> getDepartments()
	{
		List<Department> d = dService.getDepartments();
		List<DepartmentDTO> dto = convert.entityToDto(d);
		return dto;
	}
	
	@GetMapping("/departments/{id}") //PathVariable
	public DepartmentDTO getDepartment(@PathVariable("id") Long id)
	{
		return convert.entityToDto(dService.getDepartment(id));
	}
	
	@PutMapping("/departments/{id}")
	public DepartmentDTO updateDepartment(@PathVariable Long id, @RequestBody DepartmentDTO dto)
	{
		
		System.out.println("Updating the Department for ID : " + id);
		dto.setId(id);
		
		Department d = new Department();
		d = convert.dtoToEntity(dto);
		
	
		return convert.entityToDto(dService.updateDepartment(d));
	}
	
	@PostMapping("/departments")
	public DepartmentDTO saveDepartment(@RequestBody DepartmentDTO dto)
	{
		Department d = new Department();
		d = convert.dtoToEntity(dto);

		return convert.entityToDto(dService.saveDepartment(d));
	}
	
	//localhost:8080/employees?id=24
	@DeleteMapping("/departments") //dealing with requestParams
	public void deleteEmployee(@RequestParam("id") Long id) //if the requestparam parameter name is same is Long variable then we do not have to specify paramter in requestparam
	{
		dService.deleteDepartment(id);
	}

}
