package com.example;

import com.example.service.Employee;
import com.example.service.ApiService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Project implements CommandLineRunner {

    private Employee employeeService = new Employee();
    private ApiService apiService = new ApiService();

    public Project(Employee employeeService, ApiService apiService) {
        this.employeeService = employeeService;
        this.apiService = apiService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Get the employee details
        employeeService.getYoungerEmployeesCount().forEach(employeeDetails -> {
            System.out.println(employeeDetails);
        });

        // Call the second API
        String apiResponse = apiService.makeApiCall();
        System.out.println("API Response: " + apiResponse);
    }
}
