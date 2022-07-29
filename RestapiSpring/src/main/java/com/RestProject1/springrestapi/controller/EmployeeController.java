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
import com.RestProject1.springrestapi.model.Manager;
import com.RestProject1.springrestapi.repository.BenifitsRepository;
import com.RestProject1.springrestapi.repository.EmployeeRepository;
import com.RestProject1.springrestapi.service.BasicBenefitsService;
import com.RestProject1.springrestapi.service.DepartmentService;
import com.RestProject1.springrestapi.service.EmployeeService;
import com.RestProject1.springrestapi.service.ManagerService;

@RestController //@controller + @ResponseBody
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService; //as our application starts employeeservice will be injected to our Spring container

	
	@Autowired
	private BasicBenefitsService bService;
	
	
	@Autowired 
	private DepartmentService dService;
	
	@Autowired
	private ManagerService mService;
	
	//@RequestMapping(value="/employees", method = RequestMethod.GET)
	//@ResponseBody //for RestAPI
	
	@Value("${app.name}") //or ${app.name : Employee Management System}
	private String appName;
	
	@Value("${app.version}") // or ${app.version : version1}
	private String appVersion;
	
	
	@GetMapping("/version")
	public String getAppDetails()
	{
		return appName + "\n" + appVersion;
	}
	
	
	@GetMapping("/employees")  //--->@RequestMapping(--)
	public List<Employee> getEmployees()
	{
		return empService.getEmployees();
	}
	
	@GetMapping("/employees/{id}") //PathVariable
	public Employee getEmployee(@PathVariable("id") Long id)
	{
		return empService.getEmployee(id);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp)
	{
		System.out.println("Updating the Employee Data for Employee ID : " + id);
		emp.setId(id);
		return empService.updateEmployee(emp);
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee empreq)
	{
		Benifits b = new Benifits();
		Department d = new Department();
		Manager m = new Manager();
		d = (Department)dService.getDepartment(empreq.getDepartment().getId());
		m = (Manager)mService.getManager(empreq.getManager().getId());
		
		b = (Benifits)bService.getbenifit(empreq.getBenifits().getId());
		System.out.println("------->" + empreq.getBenifits().getId());
		System.out.println("------->" + (Benifits)bService.getbenifit(empreq.getBenifits().getId()));
		System.out.println("------->" + b);
		empreq.setBenifits(b);
		empreq.setDepartment(d);
		empreq.setManager(m);
		
		return empService.saveEmployee(empreq);
	}
	
	//localhost:8080/employees?id=24
	@DeleteMapping("/employees") //dealing with requestParams
	public void deleteEmployee(@RequestParam("id") Long id) //if the requestparam parameter name is same is Long variable then we do not have to specify paramter in requestparam
	{
		empService.deleteEmployee(id);
	}
	
	@GetMapping("/employees/getEmployeesByNameAndLocation")
	public ResponseEntity<List<Employee>> getEmployeesByNameAndLocation(@RequestParam String name, @RequestParam String location)
	{
		return new ResponseEntity<List<Employee>>(empService.getEmployeesbyNameandLocation(name, location), HttpStatus.OK);
	}

}
