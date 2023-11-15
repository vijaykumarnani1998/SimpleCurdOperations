package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.Employee;


//@Springbootapplication internally contains  @EnableAutoconfiguration,@ComponentScan
//@ComponentScan: Scan the current class Package and its child packages and identifies the  stereotype annotations and creates object  for the classes
//@EnableAutoconfiguration: Ex:If we add Starter Web,It will  set up the configuration like creating tomcat server which are required to run our application 
                            //Example 2 : If we add H2 Dependency, then it will internally create  internal memory database to run our application with Database

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		System.out.println("Employee Service Running");
		
	}

}
