package com.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.EmployeeDao;
import com.springMVC.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public void registerEmployee(Employee e) {

		System.out.println("Employee Data Sevice : " + e);
		dao.addEmployee(e);
	}

	@Override
	public List<Employee> getEmployee() {

//		List<Employee> elist = dao.getAllEmployee(e);
//		return elist;
		
		return dao.getAllEmployee();
	}

	@Override
	public void delEmployee(int eid) {
		dao.deleteEmployee(eid);
	}

}
