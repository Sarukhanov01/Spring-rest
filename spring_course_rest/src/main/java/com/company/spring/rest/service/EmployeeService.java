package com.company.spring.rest.service;

import com.company.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int employeeId);

    public void deleteEmployee(int id);
}
