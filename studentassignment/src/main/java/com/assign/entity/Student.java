package com.assign.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;

}
