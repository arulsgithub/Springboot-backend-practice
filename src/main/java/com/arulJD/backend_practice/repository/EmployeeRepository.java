package com.arulJD.backend_practice.repository;

import com.arulJD.backend_practice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
