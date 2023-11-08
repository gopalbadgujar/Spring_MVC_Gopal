package com.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.StudentDao;
import com.springMVC.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;
	
	@Override
	public void registerStudent(Student s) {

		dao.addStudent(s);
	}

	@Override
	public List<Student> getStudents() {

		
		return dao.getAllStudent();
	}

	@Override
	public void delStudent(int sid) {
		dao.deleteStudent(sid);
	}

	@Override
	public Student getSingleStudent(int sid) {
		 Student s= dao.getStudent(sid);
		return s;
	}

	@Override
	public void updateData(Student s) {
		dao.updateStudent(s);
	}

}
