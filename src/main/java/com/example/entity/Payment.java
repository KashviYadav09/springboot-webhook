package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {

    @Id
    private int paymentId;
    private double amount;
    private String paymentTime;

    @ManyToOne
    private Employee employee;

    // Getters and setters
}
