package com.springwave.framework_advanced;

import com.springwave.framework_advanced.bean_lifecycle.BeanLifecycle;
import com.springwave.framework_advanced.lazy_init.Car;
import com.springwave.framework_advanced.spring_scopes.SpringPrototype;
import com.springwave.framework_advanced.spring_scopes.SpringSingleton;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringFrameworkApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringFrameworkApp.class);) {
//        var context2 = new AnnotationConfigApplicationContext(SpringFrameworkApp.class);
            System.out.println("Context Initialized");
//        context.getBean(Car.class);
/* Scope Testing
        System.out.println(context.getBean(SpringSingleton.class));
        System.out.println(context.getBean(SpringSingleton.class));
        System.out.println(context2.getBean(SpringSingleton.class));
        System.out.println(context2.getBean(SpringSingleton.class));

        System.out.println(context.getBean(SpringPrototype.class));
        System.out.println(context.getBean(SpringPrototype.class));
        System.out.println(context.getBean(SpringPrototype.class));
        System.out.println(context.getBean(SpringPrototype.class));
    */

//        context.getBean(BeanLifecycle.class);
        }
    }
}
