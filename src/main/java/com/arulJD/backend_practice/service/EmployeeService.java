package com.arulJD.backend_practice.service;

import com.arulJD.backend_practice.model.Employee;

import java.util.List;


public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);

    Employee updateEmployee(Employee employee, long id);

    void deleteEmployee(long id);
}
