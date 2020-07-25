package com.babu.demos.angular.hrm.repository;

import com.babu.demos.angular.hrm.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
