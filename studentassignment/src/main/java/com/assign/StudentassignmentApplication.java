package com.assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assign.entity.Student;
import com.assign.repository.StudentRepository;

@SpringBootApplication
public class StudentassignmentApplication implements CommandLineRunner{
@Autowired
private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(StudentassignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
Student s1= Student.builder().firstName("Sonali").lastName("Mule").email("sonali@gmail.com").phoneNo("7778888888").build();
Student s2= Student.builder().firstName("Pari").lastName("Sawle").email("pari@gmail.com").phoneNo("776788888").build();
		studentRepository.save(s1);
		studentRepository.save(s2);
		System.out.println("============all saved============");
	}

	

}
