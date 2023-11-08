package com.springMVC.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springMVC.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired   // when a object is created already then use Autowired
	private SessionFactory sf;

	@Override
	public void addStudent(Student s) {

		System.out.println("Student Data Dao :- " + s);
		Session session = sf.openSession();
		
		session.save(s);
		session.beginTransaction().commit();
	}

}
