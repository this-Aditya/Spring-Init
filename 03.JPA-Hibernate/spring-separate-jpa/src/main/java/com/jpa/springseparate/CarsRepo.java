package com.jpa.springseparate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CarsRepo {

    @PersistenceContext
    EntityManager entityManager;

    public void addCar(Car car) {
        entityManager.merge(car);
    }

    public Car queryCar(int i) {
    return entityManager.find(Car.class, i);
    }

    public void deleteCar(int id) {
        Car car = queryCar(id);
        entityManager.remove(car);
    }
}
