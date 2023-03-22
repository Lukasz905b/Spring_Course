package com.springboot.course.courseapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String getGreeting() {
        return "Hello World!";
    }
}
