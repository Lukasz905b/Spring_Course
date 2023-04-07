package com.springboot.course.restproject.dao;

import com.springboot.course.restproject.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void delete(int id);
}
