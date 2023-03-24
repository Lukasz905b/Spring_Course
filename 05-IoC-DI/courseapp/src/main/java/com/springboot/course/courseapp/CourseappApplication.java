package com.springboot.course.courseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableAutoConfiguration
// @ComponentScan
// @Configuration
/* Use this if not all files are within base package
@SpringBootApplication(
		scanBasePackages = {"com.springboot.course.courseapp",
							"com.springboot.course.otherpackage"}
)
*/
@SpringBootApplication
public class CourseappApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseappApplication.class, args);
	}

}
