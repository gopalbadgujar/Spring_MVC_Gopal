package com.springMVC.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springMVC.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void addStudent(Student s) {

		Session session = sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
	}

	@Override
	public List<Student> getAllStudent() {
		Session session = sf.openSession();
		Query<Student> query = session.createQuery("from Student");
		List<Student> slist = query.getResultList();
		return slist;
	}

	@Override
	public void deleteStudent(int sid) {
		Session session = sf.openSession();
		Student s = session.get(Student.class, sid);
		session.delete(s);
		session.beginTransaction().commit();
		System.out.println("Deleted Successfully !!!");
	}

	@Override
	public Student getStudent(int sid) {
		Session session = sf.openSession();
		Student s = session.get(Student.class, sid);	
		return s;
	}

	@Override
	public void updateStudent(Student s) {
		Session session = sf.openSession();
        session.update(s);
        session.beginTransaction().commit();
	}

}
