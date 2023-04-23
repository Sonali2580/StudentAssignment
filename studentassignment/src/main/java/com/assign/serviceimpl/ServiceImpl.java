package com.assign.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.entity.Student;
import com.assign.repository.StudentRepository;
import com.assign.service.StudentService;
@Service
public class ServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student, int studentId) {
		// TODO Auto-generated method stub
		Student _student = studentRepository.findById(studentId).get();
		_student.setFirstName(student.getFirstName());
		_student.setLastName(student.getFirstName());
		_student.setEmail(student.getEmail());
		_student.setPhoneNo(student.getPhoneNo());
		return studentRepository.save(_student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public String deleteStudentById(int studentId) {
		// TODO Auto-generated method stub
		 studentRepository.findById(studentId);
		 return "student is deleted";
		
	}

}
