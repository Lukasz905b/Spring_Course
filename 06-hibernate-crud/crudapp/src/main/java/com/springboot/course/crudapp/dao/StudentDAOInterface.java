package com.springboot.course.crudapp.dao;

import com.springboot.course.crudapp.entity.Student;

import java.util.List;

public interface StudentDAOInterface {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);

    void delete(Integer id);

    int deleteAll();
}
