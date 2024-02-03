package com.springseason.person_beans;

import com.springseason.my_spring.MySpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringPerson {
    public static void main(String[] args) {
        /*  Using Beans from different packages, just by changing the Class in
        AnnotationConfigApplicationContext parameters....

        var mySpringContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
        var springMessageFromOtherPackage = context.getBean("helloSpring");
        System.out.println(springMessageFromOtherPackage);
         */

        try(var personPackageContext = new AnnotationConfigApplicationContext(PersonConfig.class)) {

            var aditya = personPackageContext.getBean("Aditya");
            var deven = personPackageContext.getBean("Deven");
            System.out.println(aditya);
            System.out.println(deven);

//        Arrays.stream(personPackageContext.getBeanDefinitionNames()).forEach(System.out::println);

            var adityaFavBike = personPackageContext.getBean(String.class);
            System.out.println(adityaFavBike);

        }
    }
}
