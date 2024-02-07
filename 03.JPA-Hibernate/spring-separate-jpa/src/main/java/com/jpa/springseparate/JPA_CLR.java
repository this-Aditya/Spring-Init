package com.jpa.springseparate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JPA_CLR implements CommandLineRunner {

    @Autowired
    CarsRepo repo;

    @Override
    public void run(String... args) throws Exception {
        insertCars();
        deleteRR();
        queryAllCars();
    }

    public void deleteRR() {
        repo.deleteCar(1);
    }

    public void queryAllCars() {
        System.out.println("Querying cars");
        System.out.println(repo.queryCar(2));
        System.out.println(repo.queryCar(3));
        System.out.println(repo.queryCar(4));
        System.out.println("Queried cars");
    }

    public void insertCars() {
        System.out.println("Inserting cars");
        Car rr = new Car();
        rr.setCarId(1);
        rr.setCarCompany("Range Rover");
        rr.setCarName("Velar");

        Car bmw = new Car();
        bmw.setCarId(2);
        bmw.setCarCompany("BMW");
        bmw.setCarName("760-li");

        Car mercedes = new Car();
        mercedes.setCarId(3);
        mercedes.setCarCompany("Mercedes");
        mercedes.setCarName("Maybach gls 600");

        Car fortuner = new Car();
        fortuner.setCarId(4);
        fortuner.setCarName("Fortuner");
        fortuner.setCarCompany("Toyota");

        repo.addCar(rr);
        repo.addCar(bmw);
        repo.addCar(mercedes);
        repo.addCar(fortuner);

        System.out.println("Inserted cars");
    }
}
