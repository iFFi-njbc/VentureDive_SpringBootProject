package com.RestProject1.springrestapi.controller;

import java.util.ArrayList;
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
import com.RestProject1.springrestapi.model.Employee;
import com.RestProject1.springrestapi.service.BasicEmployeeService;
import com.RestProject1.springrestapi.service.BenifitsService;
import com.RestProject1.springrestapi.service.EmployeeService;

@RestController
public class BenifitsController {
	
	
	@Autowired
	private BenifitsService bService; //as our application starts employeeservice will be injected to our Spring container

		@Autowired
		private BasicEmployeeService eService;
	
	@GetMapping("/benifits")  //--->@RequestMapping(--)
	public List<Benifits> getBenifits()
	{
		return bService.getBenifits();
	}
	
	@GetMapping("/benifits/{id}") //PathVariable
	public Benifits getBenifit(@PathVariable("id") Long id)
	{
		return bService.getbenifit(id);
	}
	
	@PutMapping("/benifits/{id}")
	public Benifits updateBenifit(@PathVariable Long id, @RequestBody Benifits b)
	{
		System.out.println("Updating the Benifits Data for  ID : " + id);
		b.setId(id);
		return bService.updateBenifit(b);
	}
	
	@PostMapping("/benifits")
	public Benifits saveBenifit(@RequestBody Benifits b)
	{
		return bService.saveBenefit(b);
	}
	
	//localhost:8080/employees?id=24
	@DeleteMapping("/benifits") //dealing with requestParams
	public void deleteEmployee(@RequestParam("id") Long id) //if the requestparam parameter name is same is Long variable then we do not have to specify paramter in requestparam
	{
		bService.deleteBenifit(id);
	}
	
	@GetMapping("/getEmployeesByBenifits")
	public List<Employee> getEmployees(@RequestParam("id") Long id)
	{
		return bService.getEmployees(id);
	}
	
}



