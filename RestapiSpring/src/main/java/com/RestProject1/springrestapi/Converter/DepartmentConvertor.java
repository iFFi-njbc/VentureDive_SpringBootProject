package com.RestProject1.springrestapi.Converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.RestProject1.springrestapi.DTO.DepartmentDTO;
import com.RestProject1.springrestapi.DTO.EmployeeDTO;
import com.RestProject1.springrestapi.model.Benifits;
import com.RestProject1.springrestapi.model.Department;
import com.RestProject1.springrestapi.model.Employee;

@Component
public class DepartmentConvertor {
	public DepartmentDTO entityToDto(Department d)
	{
		DepartmentDTO dto = new DepartmentDTO();
		dto.setId(d.getId());
		dto.setName(d.getName());
		
		return dto;
	}
	
	
	public List<DepartmentDTO> entityToDto(List<Department> d)
	{
		return (List<DepartmentDTO>)d.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	
	
	
	public Department dtoToEntity(DepartmentDTO dto)
	{
		Department d = new Department();

		

		d.setId(dto.getId());

		d.setName(dto.getName());
		return d;
	}
	
	
	public List<Department> dtoToEntity(List<DepartmentDTO> dto)
	{
		return (List<Department>)dto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
	

}
