package com.springMVC.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springMVC.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void addEmployee(Employee e) {
		System.out.println("Employee Data DAO : " + e);

		Session session = sf.openSession();

		session.save(e);
		session.beginTransaction().commit();

	}

	@Override
	public List<Employee> getAllEmployee() {

		Session session = sf.openSession();

		Query<Employee> query = session.createQuery("from Employee");
		List<Employee> elist = query.getResultList();

		return elist;
	}

	@Override
	public void deleteEmployee(int eid) {
		Session session = sf.openSession();

		Employee e = session.get(Employee.class, eid);
		
		session.delete(e);
		session.beginTransaction().commit();
		System.out.println("Deleted Successfully !!");
	}

}
