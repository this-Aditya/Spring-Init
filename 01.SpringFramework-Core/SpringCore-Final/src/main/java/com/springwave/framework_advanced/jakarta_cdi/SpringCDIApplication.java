package com.springwave.framework_advanced.jakarta_cdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringCDIApplication {

    public static void main(String[] args) {
        try ( AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringCDIApplication.class)) {
            School school = context.getBean(School.class);
            School school2 = (School) context.getBean("school");
            System.out.println(school);
            System.out.println(school2);
        }
    }
}
