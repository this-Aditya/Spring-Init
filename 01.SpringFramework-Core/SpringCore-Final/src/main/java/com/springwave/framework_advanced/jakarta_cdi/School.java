package com.springwave.framework_advanced.jakarta_cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Named
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Singleton
public class School {

    @Inject
    Buses buses;
    Playground playground;
    Students students;
    Teachers teachers;


    public School(Students students, Teachers teachers) {
        System.out.println("Constructing the school");
        this.students = students;
        this.teachers = teachers;
    }


    @Inject
    public void setPlayground(@Qualifier("ground") Playground playground) {
        System.out.println("Constructing playground");
        this.playground = playground;
    }
}






