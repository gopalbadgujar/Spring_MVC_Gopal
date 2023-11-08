package com.springMVC.dao;

import java.util.List;

import com.springMVC.model.Employee;

public interface EmployeeDao {

	void addEmployee(Employee e);
	
	List<Employee> getAllEmployee();
	
	void deleteEmployee(int eid);
}
