package com.example.service;

import com.example.service.*;
import com.example.entity.*;
import com.example.repository.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Employee {

    @Autowired
    private Employee employeeRepository;

    @Autowired
    private Department departmentRepository;

    public List<EmployeeDetailsDTO> getYoungerEmployeesCount() {
        List<Employee> employees = employeeRepository.findAll();

        return employees.stream()
            .map(emp -> {
                long count = employees.stream()
                        .filter(e -> e.getDepartment().equals(emp.getDepartment()) && ((LocalDate) e.getDob()).isAfter((ChronoLocalDate) emp.getDob()))
                        .count();

                return new EmployeeDetailsDTO(
                );
            })
            .sorted((a, b) -> Integer.compare(b.getEmpId(), a.getEmpId()))
            .collect(Collectors.toList());
    }

	private Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getEmpId() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getDob() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
