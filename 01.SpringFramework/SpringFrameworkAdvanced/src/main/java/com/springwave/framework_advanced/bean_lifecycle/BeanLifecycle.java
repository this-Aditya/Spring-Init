package com.springwave.framework_advanced.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycle {

    Dependency dependency;

    public BeanLifecycle(Dependency dependency) {
        this.dependency = dependency;
    }

    @PostConstruct
    public void setupBean() {
        dependency.setUp();
    }

    @PreDestroy
    public void finalizeBean() {
        dependency.cleanup();
    }
}
