package com.springboot.jpahibernate.garage.jpa;

import com.springboot.jpahibernate.garage.Garage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GarageJpaCLR implements CommandLineRunner {
    
    @Autowired
    GarageJpaRepo repo;
    
    @Override
    public void run(String... args) throws Exception {
//        insertJpaGarageGarageItems();
//        deleteGarageItems();
//        queryGarageItems();
    }

    private void queryGarageItems() {
        System.out.println("Querying from JPA");
        System.out.println(repo.queryGarageItems(1));
        System.out.println(repo.queryGarageItems(3));
        System.out.println(repo.queryGarageItems(4));
        System.out.println("Queried from JPA");
    }

    private void deleteGarageItems() {
        repo.deleteJpaById(2);
    }

    private void insertJpaGarageGarageItems() {
        System.out.println("Inserting into JPA");
        repo.insertJpaGarage(new Garage(1, "Royal Enfield", "Classic 350-Chrome Bronze"));
        repo.insertJpaGarage(new Garage(2, "Land Rover", "Range Rover Velar"));
        repo.insertJpaGarage(new Garage(3, "BMW", "760-li"));
        repo.insertJpaGarage(new Garage(4, "Mercedes", "Maybach gls 600"));
        System.out.println("Inserted into JPA");
    }
}
