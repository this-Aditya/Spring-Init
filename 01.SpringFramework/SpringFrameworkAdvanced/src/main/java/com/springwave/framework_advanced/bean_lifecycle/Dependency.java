package com.springwave.framework_advanced.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Dependency {
    public void setUp() {
        System.out.println("Setting Up the dependency as a part of the Post Construct");
    }

    public void cleanup() {
        System.out.println("Performing cleanup as a part of the Pre Destroy");
    }

    @PostConstruct
    public void postConstructing() {
        System.out.println("PostConstruct: DEPENDENCY");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy: DEPENDENCY");
    }
}
