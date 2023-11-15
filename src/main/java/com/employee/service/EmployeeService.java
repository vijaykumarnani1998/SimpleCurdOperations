package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public  Employee saveEmployee(Employee employee)
	{
		return repo.save(employee);
	}
	
	public List<Employee> getAllEmployees()
	{
		return repo.findAll();
	}
    
	public Employee getOneEmployeeById(Integer id)
	{
		  Optional<Employee> findById = repo.findById(id);
		  Employee employee = findById.get();
		  return employee;
	}
	public void  deleteEmployeeById(Integer id)
	{
		 repo.deleteById(id);
	}
	public String  updateEmployee(Employee employee)
	{
		
		if( employee.getId()!=null)
		{
			repo.save(employee);
			return "Employee Updated";
		}
		else
		{
			return "Please provide with id";
		}
		
		
	
		
		// return repo.save(employee);
	}
		public String deleteEmployee(Integer id)
		{
			repo.deleteById(id);
			return  "Employee of :"+ id+ "Deleted";
		}

}
