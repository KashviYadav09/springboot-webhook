package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    private int empId;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;

    @ManyToOne
    private Department department;

	public Object getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEmpId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters
}
