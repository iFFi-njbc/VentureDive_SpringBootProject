package com.Microservices.employee_service.converter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.Microservices.employee_service.dto.EmployeeDTO;
import com.Microservices.employee_service.model.Benifits;
import com.Microservices.employee_service.model.Department;
import com.Microservices.employee_service.model.Employee;

@Component
public class Convertor {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private Benifits b;
	@Autowired
	private Department d;
	
	public EmployeeDTO entityToDto(Employee emp)
	{
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(emp.getId());
		dto.setAge(emp.getAge());
		dto.setEmail(emp.getEmail());
		dto.setName(emp.getName());
		
		b = this.restTemplate.getForObject("http://localhost:9003/RESTapi/v1/benifits/" + emp.getBenifits().getId(), Benifits.class);
		dto.setBenifits(b.getId());
		
		//dto.setBenifits(this.restTemplate.getForObject("http://localhost:9003/RESTapi/v1/benifits/" + emp.getBenifits().getId(), Long.class));
				
		//dto.setBenifits(emp.getBenifits().getId());
		
		d = this.restTemplate.getForObject("http://localhost:9002/RESTapi/v1/departments/" +emp.getDepartment().getId(), Department.class);
		dto.setDepartment(d.getId());
		
		//dto.setDepartment(this.restTemplate.getForObject("http://localhost:9002/RESTapi/v1/departments/" + emp.getDepartment().getId(), Long.class));
		//dto.setDepartment(emp.getDepartment().getId());
		dto.setLocation(emp.getLocation());
		//dto.setDeleted(emp.getDeleted());
		if(emp.getManager() != null)
		{
			dto.setManager(emp.getManager().getId());
		}
		else
		{
			dto.setManager(null);
		}
		
		return dto;
	}
	
	
	public List<EmployeeDTO> entityToDto(List<Employee> emp)
	{
		return (List<EmployeeDTO>)emp.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	
	
	
	public Employee dtoToEntity(EmployeeDTO dto)
	{
		Employee emp = new Employee();

		//b.setId(this.restTemplate.getForObject("http://localhost:9003/RESTapi/v1/benifits/" + dto.getBenifits(), Long.class));
		b = this.restTemplate.getForObject("http://localhost:9003/RESTapi/v1/benifits/" + dto.getBenifits(), Benifits.class);
		b.setId(dto.getBenifits());

		//d.setId(this.restTemplate.getForObject("http://localhost:9002/RESTapi/v1/departments/" + dto.getDepartment(), Long.class));
		d = this.restTemplate.getForObject("http://localhost:9002/RESTapi/v1/departments/" +dto.getDepartment(), Department.class);
		d.setId(dto.getDepartment());
		
		Employee m = new Employee();
		m.setId(dto.getManager());
		
		emp.setLocation(dto.getLocation());
		emp.setId(dto.getId());
		emp.setAge(dto.getAge());
		emp.setEmail(dto.getEmail());
		emp.setName(dto.getName());
		emp.setBenifits(b);
		emp.setDepartment(d);
		emp.setManager(m);
		//emp.setDeleted(dto.getDeleted());
		
		return emp;
	}
	
	
	public List<Employee> dtoToEntity(List<EmployeeDTO> dto)
	{
		return (List<Employee>)dto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
	
	

}
