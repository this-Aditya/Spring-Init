package com.jdbc.springseparate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoryJDBC {

    @Autowired
    JdbcTemplate carJdbcTemplate;

    public void addCars(Car car) {
        carJdbcTemplate.update(INSERT_CAR, car.getCarId(), car.getCarCompany(), car.getCarName());
    }

    public void deleteCar(int id) {
        carJdbcTemplate.update(DELETE_CAR, id);
    }

    public Car queryCars(int id) {
        return carJdbcTemplate.queryForObject(QUERY_CAR, new BeanPropertyRowMapper<>(Car.class), id);
    };


    public static final String  QUERY_CAR =
            """
                    select * from car where id = ?;
                    """;


    public static final String INSERT_CAR =
            """
                    insert into car(id, company, name) values
                    (?,?,?);
                    """;

    public static final String DELETE_CAR =
            """
                    delete from car where id = ?
                    """;

//    public static final String INSERT_MAYBACH =
//            """
//                    insert into car(id, company, id) values
//                    (?,?,?);
//                    """;

}
