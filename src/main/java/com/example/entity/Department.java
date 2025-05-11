package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    private int departmentId;
    private String departmentName;

    // Getters and setters
}
