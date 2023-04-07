package com.springboot.course.restproject.service;

import com.springboot.course.restproject.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void delete(int id);
}
