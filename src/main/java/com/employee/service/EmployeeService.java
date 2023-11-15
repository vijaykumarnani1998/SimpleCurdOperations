package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;

public interface EmployeeService {
	
	public  Employee  saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Optional<Employee> getOneEmployeeById(Integer id);
	
	public void  deleteEmployeeById(Integer id);
	
	public Employee  updateEmployee(Employee employee);

}
