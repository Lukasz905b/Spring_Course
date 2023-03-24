package com.springboot.course.courseapp.rest;

import com.springboot.course.courseapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    /*
        Field injection
        Not recommended / legacy feature
        Makes testing more difficult
        Uses Java Reflection
     */
    //@Autowired
    private Coach myCoach;

    /*
        Constructor injection
        Used for required dependencies
        Recommended first choice
     */
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    /*
        Setter injection
        Used for optional dependencies
        In case of no dependency provided the app should implement default behaviour
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }
     */

    @GetMapping("/workout")
    public String getWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String getGreeting() {
        return "Hello World!";
    }
}
