package com.springseason.my_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfig {

@Bean
public String helloSpring() {
    return "Welcome to Spring Framework";
}

}
