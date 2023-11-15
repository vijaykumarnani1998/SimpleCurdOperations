package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;


//Rest Controller Internally contains @Controller + @ResponseBody
//ResponseBody: Responsible for converting Java Object to JSON object
//RequestBody : Responsible for converting JSON  Object to Java object
//PathVariable :Reads data from URL like  localhost://9090/employee/1
//RequestParam : Reads data from URL like localhost://9090/employee/id?=1

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/create")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);	
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getOneEmployee(@PathVariable Integer id)
	{
		return service.getOneEmployeeById(id);	  
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Integer id)
	{
		 service.deleteEmployeeById(id);	  
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
		
	}
}
