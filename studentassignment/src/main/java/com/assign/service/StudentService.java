package com.assign.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.assign.entity.Student;

@Component
public interface StudentService {
	Student createStudent(Student student);
	Student updateStudent(Student student,int studentId);
    List<Student> getAllStudent();
    String deleteStudentById(int studentId);

	
	

}
