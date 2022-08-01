package com.sales.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.sales.demo.Models.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
       
}
