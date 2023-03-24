package com.springboot.course.courseapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary -> this bean will be used as the default Coach implementation in case of ambiguity
//@Lazy -> this bean will not be initialized until needed for dependency injection
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) -> changes the scope of the bean (default scope is SINGLETON)
// Prototype scope beans are lazy by default
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /* Bean Initialization method
    @PostConstruct
    public void initializer() {
        System.out.println("In initializer of: " + getClass().getSimpleName());
    }
     */

    /* Bean Cleanup method
    @PreDestroy
    public void cleanup() {
        System.out.println("In cleanup of: " + getClass().getSimpleName());
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
