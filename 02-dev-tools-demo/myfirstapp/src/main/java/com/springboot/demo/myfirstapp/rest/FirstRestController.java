package com.springboot.demo.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

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

}
