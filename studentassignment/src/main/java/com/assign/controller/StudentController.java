package com.assign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assign.entity.Student;
import com.assign.service.StudentService;
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/stud")
	public Student createStudent(@RequestBody Student student) {
	
		return studentService.createStudent(student);
	}
	@PutMapping("/stud/{studentId}")
	public Student updateStudent(@RequestBody Student student, @PathVariable int studentId) {
		
		return studentService.updateStudent(student, studentId);
	}
	@GetMapping("/stud")
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentService.getAllStudent();
	}
	@DeleteMapping("/stud/{studentId}")
	public String deleteStudentById(@PathVariable int studentId) {
		// TODO Auto-generated method stub
		return  studentService.deleteStudentById(studentId);
		
		
	}


}
