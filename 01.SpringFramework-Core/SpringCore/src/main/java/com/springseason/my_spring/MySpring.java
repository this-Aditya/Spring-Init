package com.springseason.my_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.springseason.my_spring")
public class MySpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        String messageFromSpring = (String) context.getBean("helloSpring");
        System.out.println(messageFromSpring);
    }
}
