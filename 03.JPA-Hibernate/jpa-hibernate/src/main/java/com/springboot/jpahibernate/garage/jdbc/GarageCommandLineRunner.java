package com.springboot.jpahibernate.garage.jdbc;

import com.springboot.jpahibernate.garage.GarageToInsert;
import com.springboot.jpahibernate.garage.jdbc.GarageJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GarageCommandLineRunner implements CommandLineRunner {

    @Autowired
    private GarageJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        /* JDBC ->
        repository.insertHardCoded();
        jdbcInsertUsingParams();
        jdbcDeleteUsingParams();
        jdbcFindVehicleById(); */

    }

    private void jdbcFindVehicleById() {
        System.out.println(repository.queryVehicleById(1));
        System.out.println(repository.queryVehicleById(3));
        System.out.println(repository.queryVehicleById(4));
    }

    private void jdbcDeleteUsingParams() {
        repository.deleteUsingParams(2);
    }

    private void jdbcInsertUsingParams() {
        repository.insertUsingParams(new GarageToInsert(1, "Royal Enfield", "Classic 350-Chrome Bronze"));
        repository.insertUsingParams(new GarageToInsert(2, "Land Rover", "Range Rover Velar"));
        repository.insertUsingParams(new GarageToInsert(3, "BMW", "760-li"));
        repository.insertUsingParams(new GarageToInsert(4, "Mercedes", "Maybach gls 600"));
    }
}
