package com.employee;

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
	public Employee getOneEmployee(@PathVariable Integer id)
	{
		return service.getOneEmployeeById(id);
		  
	}
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Integer id)
	{
		return service.deleteEmployee(id);
		  
	}
	@GetMapping("/all")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
		
	}
}
