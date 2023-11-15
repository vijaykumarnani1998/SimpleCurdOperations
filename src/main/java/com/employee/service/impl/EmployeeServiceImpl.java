package com.employee.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.model.Employee;
import com.employee.repo.EmployeeRepository;
import com.employee.service.EmployeeService;


//Service is Stereotype Annotation : It Internally contains  @Component .
//@Component :Which is responsible for creating object in Spring IOC Container
@Service
public class EmployeeServiceImpl  implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public  Employee  saveEmployee(Employee employee)
	{
 		  return  repo.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees()
	{
		return repo.findAll();
	}
	@Override
	public Optional<Employee> getOneEmployeeById(Integer id)
	{
		
		//Optional Class: Java 8 Feature
	 return repo.findById(id);
	
	}
	@Override
	public void  deleteEmployeeById(Integer id)
	{
		 repo.deleteById(id);
	}
	@Override
	public Employee  updateEmployee(Employee employee)
	{
		 return repo.save(employee);
	}
		
	
}
