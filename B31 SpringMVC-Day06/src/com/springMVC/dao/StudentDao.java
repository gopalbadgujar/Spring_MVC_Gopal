package com.springMVC.dao;

import java.util.List;

import com.springMVC.model.Student;

public interface StudentDao {

	void addStudent(Student s);
	
	List<Student> getAllStudent();
	
	void deleteStudent(int sid);
	
	Student getStudent(int sid);
	
	void updateStudent(Student s);
}
