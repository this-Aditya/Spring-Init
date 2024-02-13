package com.jdbc.springseparate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarCLR implements CommandLineRunner {

    @Autowired
    CarRepositoryJDBC repository;

    @Override
    public void run(String... args) throws Exception {
        insertCars();
        deleteCar();
        getCars();
    }

    public void deleteCar() {
        repository.deleteCar(3);
    }

    public void getCars() {
        System.out.println("Getting cars");
        System.out.println(repository.queryCars(1));
        System.out.println(repository.queryCars(2));
        System.out.println("Got cars");
    }

    private void insertCars() {
        System.out.println("Inserting cars");
        Car one = new Car(1);
        one.setId(1);
        one.setCompany("BMW");
        one.setName("760-li");

        Car two = new Car(2);
        two.setId(2);
        two.setCompany("Mercedes");
        two.setName("Maybach gls 600");

        Car three = new Car(3);
        three.setId(3);
        three.setCompany("Range Rover");
        three.setName("Velar");

        repository.addCars(one);
        repository.addCars(two);
        repository.addCars(three);
        System.out.println("Inserted Cars");
    }
}
