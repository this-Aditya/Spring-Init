package com.springboot.jpahibernate.garage.jpa;

import com.springboot.jpahibernate.garage.Garage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class GarageJpaRepo {

    @PersistenceContext
    EntityManager manager;

    public void insertJpaGarage(Garage garage) {
        manager.merge(garage);
    }

    public void deleteJpaById(int id) {
        Garage garage = manager.find(Garage.class, id);
        manager.remove(garage);
    }

    public Garage queryGarageItems(int id) {
        return manager.find(Garage.class, id);
    }
}
