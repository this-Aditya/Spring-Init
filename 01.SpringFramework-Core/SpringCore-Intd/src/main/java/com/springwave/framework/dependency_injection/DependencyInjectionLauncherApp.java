package com.springwave.framework.dependency_injection;


import com.springwave.framework.dependency_injection.dependent_classes.Bike;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApp {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context
                     = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApp.class)) {

            Bike bike = context.getBean(Bike.class);
        }
    }
}
