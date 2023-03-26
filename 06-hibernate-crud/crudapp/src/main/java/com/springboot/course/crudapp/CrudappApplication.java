package com.springboot.course.crudapp;

import com.springboot.course.crudapp.dao.StudentDAOInterface;
import com.springboot.course.crudapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAOInterface studentDAO) {

		return runner -> {
			// createStudent(studentDAO);

			// readStudent(studentDAO);

			// readAllStudents(studentDAO);

			// readStudentsByLastName(studentDAO);

			// updateStudent(studentDAO);

			// deleteStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAOInterface studentDAO) {

		// Create the student
		Student student = new Student("Jane", "Doe", "pauldoe@gmail.com");
		System.out.println("Created student: " + student.toString());

		// Save the student
		studentDAO.save(student);
		System.out.println("Save a student. Generated id: " + student.getId());
	}

	private void readStudent(StudentDAOInterface studentDAO) {

		// Create the student
		Student student = new Student("John", "Smith", "pauldoe@gmail.com");
		System.out.println("Created student: " + student.toString());

		// Save the student
		studentDAO.save(student);
		System.out.println("Saved student. Generated id: " + student.getId());

		// Find student by id
		Student foundStudent = studentDAO.findById(student.getId());
		System.out.println("Found student: " + foundStudent.toString());
	}

	private void readAllStudents(StudentDAOInterface studentDAO) {
		List<Student> students = studentDAO.findAll();
		for(Student student : students) {
			System.out.println("Found student: " + student.toString());
		}
	}

	private void readStudentsByLastName(StudentDAOInterface studentDAO) {
		List<Student> students = studentDAO.findByLastName("doe");
		for(Student student : students) {
			System.out.println("Found student: " + student.toString());
		}
	}

	private void updateStudent(StudentDAOInterface studentDAO) {
		Student student = studentDAO.findById(1);
		System.out.println("Found student: " + student);
		student.setLastName("Doe");
		studentDAO.update(student);
		System.out.println("Updated student to: " + student);
	}

	private void deleteStudent(StudentDAOInterface studentDAO) {

		// List all students before deletion
		List<Student> students = studentDAO.findAll();
		System.out.println("Listing all students ...");
		for(Student student : students) {
			System.out.println(student);
		}

		// Delete a student
		System.out.println("Removing student ...");
		studentDAO.delete(3);

		// List all students after deletion
		students = studentDAO.findAll();
		System.out.println("Listing all students ...");
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
