package com.springMVC.service;

import java.util.List;

import com.springMVC.model.Employee;

public interface EmployeeService {

	void registerEmployee(Employee e);
	
	List<Employee> getEmployee();
	
	void delEmployee(int eid);
}
