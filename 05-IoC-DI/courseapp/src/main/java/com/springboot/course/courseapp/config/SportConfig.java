package com.springboot.course.courseapp.config;

import com.springboot.course.courseapp.common.Coach;
import com.springboot.course.courseapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration class used to define custom beans
@Configuration
public class SportConfig {

    // User defined bean that returns an instance of SwimCoach
    // Used to convert classes without @Component into beans
    // Useful when trying to convert a third party class into a Spring Bean
    @Bean("swimCoach")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}