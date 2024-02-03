package com.springwave.framework_advanced;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLConfig {

    public static void main(String[] args) {
        try ( var context =
                new ClassPathXmlApplicationContext("context_config.xml")) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("config_class"));
        }
    }
}
