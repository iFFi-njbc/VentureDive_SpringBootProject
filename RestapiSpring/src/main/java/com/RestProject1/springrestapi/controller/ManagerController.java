package com.RestProject1.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.RestProject1.springrestapi.model.Manager;
import com.RestProject1.springrestapi.service.DepartmentService;
import com.RestProject1.springrestapi.service.ManagerService;

@RestController
public class ManagerController {
	
	
	@Autowired
	private ManagerService mService;
	
	@Autowired
	private DepartmentService dService;
	
	@GetMapping("/managers/{id}") //PathVariable
	public Manager getManager(@PathVariable("id") Long id)
	{
		return mService.getManager(id);
	}
	
	
	@GetMapping("/managers")
	public List<Manager> getManagers()
	{
		return mService.getManagers();
	}
	
	@PutMapping("/managers/{id}")
	public Manager updateManager(@PathVariable Long id, @RequestBody Manager m)
	{
		System.out.println("Updating the Manager Data for Manager ID : " + id);
		m.setId(id);
		return mService.updateManager(m);
	}
	
	@PostMapping("/managers")
	public Manager saveManager(@RequestBody Manager m)
	{
		
		Department d = new Department();
		d = (Department)dService.getDepartment(m.getDepartment().getId());
		m.setDepartment(d);
		return mService.saveManager(m);
	}
	
	//localhost:8080/employees?id=24
	@DeleteMapping("/managers") //dealing with requestParams
	public void deleteManager(@RequestParam("id") Long id) //if the requestparam parameter name is same is Long variable then we do not have to specify paramter in requestparam
	{
		mService.deleteManager(id);
	}

}
