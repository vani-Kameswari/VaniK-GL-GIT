package com.lab6.student.registration.event.service;


import java.util.List;

import com.lab6.student.registration.event.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

	

}
