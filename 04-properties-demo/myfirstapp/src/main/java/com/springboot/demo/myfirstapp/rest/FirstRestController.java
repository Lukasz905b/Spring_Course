package com.springboot.demo.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${subject.name}")
    private String subjectName;

    @Value("${project.name}")
    private String projectName;

    @Value("${project.status}")
    private String projectStatus;

    // expose "/" that will return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Dead-lift at least 110kg!";
    }

    //expose new endpoint for "encourage"
    @GetMapping("/encourage")
    public String getEncouragement() {
        return "You can do it!";
    }

    //expose the project info endpoint
    @GetMapping("/projectInfo")
    public String getProjectInfo() {
        return "The subject is: " + subjectName + "\n The project is: " + projectName + "\n The project status is: " + projectStatus;
    }

}
