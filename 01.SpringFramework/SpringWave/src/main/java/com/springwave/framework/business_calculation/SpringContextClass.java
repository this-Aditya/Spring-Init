package com.springwave.framework.business_calculation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SpringContextClass {
    public static void main(String[] args) {
      try (var context = new AnnotationConfigApplicationContext(SpringContextClass.class)) {
          BusinessCalculationService service = context.getBean(BusinessCalculationService.class);
          System.out.println(service.findMax());
//          Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      }
    }
}
